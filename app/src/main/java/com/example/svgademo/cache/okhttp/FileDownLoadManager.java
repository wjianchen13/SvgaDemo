package com.example.svgademo.cache.okhttp;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

import com.example.svgademo.cache.utils.Md5Utils;
import com.jakewharton.disklrucache.DiskLruCache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 文件下载管理类
 */
public class FileDownLoadManager extends HandlerHolder {

	private static final String TAG = FileDownLoadManager.class.getSimpleName();

	private String downloadPath;
	private String absolutePath;
	private Context mContext;
	private DiskLruCache mDiskLruCache;

	private final OkHttpClient client = new OkHttpClient.Builder()
			.connectTimeout(60000, TimeUnit.SECONDS) // 设置超时，不设置可能会报异常
			.readTimeout(60000, TimeUnit.SECONDS)
			.writeTimeout(60000, TimeUnit.SECONDS)
			.build();

	@NonNull
	private final OnHttpFileDownLoadListener mListener;
	private boolean isCancel;
	private Call mCurCall;

	/**
	 * 获取文件名
	 * https://img. ayomet.com/upload/entrance_float/animation/2923-10-11/10f461e9459f2981287ebb4367566e3b.svga?imageslin
	 * @return
	 */
	private String getFileName(String url) {
		if(TextUtils.isEmpty(url)) {
			return url;
		}
		if(url.contains("?imageslim"))
			url = url.replace("?imageslim", "");
		return url.substring(url.lastIndexOf("/") + 1);
	}


	private String getDownloadFilePath() {
		if(TextUtils.isEmpty(downloadPath)) {
			downloadPath = getFilePath(getFilePath(absolutePath, "anim"), "svga");
		}
		return downloadPath;
	}

	private static String getFilePath(String rootPath, String name) {
		String path = rootPath + File.separator + name;
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		return path;
	}

	private File getDownloadFile(String name) {
		String fileName = getDownloadFilePath() + File.separator + name;
		File file = new File(fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}

	public FileDownLoadManager(Context context, final OnHttpFileDownLoadListener listener) {
		this(context, null, true, listener);
	}

	public FileDownLoadManager(Context context, DiskLruCache diskLruCache, final OnHttpFileDownLoadListener listener) {
		this(context, diskLruCache, true, listener);
	}

	public FileDownLoadManager(Context context, DiskLruCache diskLruCache, boolean isMainThread, final OnHttpFileDownLoadListener listener) {
		this.mDiskLruCache = diskLruCache;
		if(context != null) {
			mContext = context;
			absolutePath = mContext.getFilesDir().getAbsolutePath();
			getDownloadFilePath();
		}
		mListener = new OnHttpFileDownLoadListener() {
			boolean isOnDownLoadSuccess;

			@Override
			public void onPrepareDownLoad() {
				OnHttpFileDownLoadListener.super.onPrepareDownLoad();
				if (listener != null) {
					if (isMainThread) {
						post(listener::onPrepareDownLoad);
					} else {
						listener.onPrepareDownLoad();
					}
				}
			}

			@Override
			public void onCheckHttpFileSize(boolean isCheckSuccess, long fileTotalSize) {
				if (listener != null) {
					if (isMainThread) {
						post(() -> {
							listener.onCheckHttpFileSize(isCheckSuccess, fileTotalSize);
						});
					} else {
						listener.onCheckHttpFileSize(isCheckSuccess, fileTotalSize);
					}
				}
			}

			@NonNull
			@Override
			public long[] onSetRange() {
				return listener != null ? listener.onSetRange() : OnHttpFileDownLoadListener.super.onSetRange();
			}

			@Override
			public void onAlreadyDownLoadLength(long length, long total, int progress) {
				if (listener != null) {
					if (isMainThread) {
						post(() -> {
							listener.onAlreadyDownLoadLength(length, total, progress);
						});
					} else {
						listener.onAlreadyDownLoadLength(length, total, progress);
					}
				}
			}

			@Override
			public void onDownLoadSuccess(boolean success, String msg) {
				if (isOnDownLoadSuccess)
					return;
				isOnDownLoadSuccess = true;
				if (listener != null) {
					if (isMainThread) {
						post(() -> {
							listener.onDownLoadSuccess(success, msg);
						});
					} else {
						listener.onDownLoadSuccess(success, msg);
					}
				}
			}
		};
	}

	/**
	 * 使用okhttp下载文件
	 *
	 * @param: raFile 文件
	 * @param: httpFileDownLoadUrl 文件网络路径
	 * @return: void
	 */
	public void executeHttpFile1(File raFile, String httpFileDownLoadUrl, String tagName, final OnHttpFileDownLoadListener listener) {
		final File file = raFile;

		final long fileLen = mListener.onSetRange()[0];
		final Request request1 = new Request.Builder()
				.url(httpFileDownLoadUrl)
				.addHeader("Range", "bytes=" + fileLen + "-")
				.build();

		//包装Response使其支持进度回调
		client.newCall(request1).enqueue(new Callback() {

			long downLoadCallTime;

			@Override
			public void onFailure(@NonNull Call call, @NonNull IOException e) {
				if(listener != null)
					listener.onDownLoadSuccess(false, tagName);
			}

			@Override
			public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
				log("response.isSuccessful(): " + response.isSuccessful() + "  response.body() != null: " + (response.body() != null));

//				int loop = 0;
				if (response.isSuccessful() && response.body() != null) {
					if(listener != null)
						listener.onPrepareDownLoad();
					final long contentLength = response.body().contentLength() + fileLen;
					if(listener != null)
						listener.onCheckHttpFileSize(true, contentLength);
					log("contentLength: " + contentLength);
					long bytesRead = fileLen;
					InputStream inputStream = null;
					FileChannel channelOut = null;
					RandomAccessFile randomAccessFile = null;
					try {
						inputStream = response.body().byteStream();
						randomAccessFile = new RandomAccessFile(file, "rwd");
						channelOut = randomAccessFile.getChannel();
						MappedByteBuffer mappedBuffer = channelOut.map(FileChannel.MapMode.READ_WRITE, bytesRead, contentLength);
						byte[] buff = new byte[1024 * 4];
						log("download complete1: " + ((int) (bytesRead * 100 / contentLength)));
						if(listener != null)
							listener.onAlreadyDownLoadLength(bytesRead, contentLength, (int) (bytesRead * 100 / contentLength));

						while (true) {
//							if(GlobalConfig.isTest() && !isNotFirst) {
//								if (loop >= 5) {
//									throw new Exception();
//								}
//								loop ++;
//								isNotFirst = true;
//								log(TAG, "===============> loop:" + loop);
//							}

							int read = inputStream.read(buff);
							if (read == -1) {
								break;
							}
							bytesRead = bytesRead + read;
							mappedBuffer.put(buff, 0, read);
//							log("download complete2 read: " + read + "   bytesRead: " + bytesRead + "   progress: " + ((int) (bytesRead * 100 / contentLength)));
							// 避免过多调用，导致卡顿
							long curTime = SystemClock.elapsedRealtime();
							// ui层回调
							if (curTime - downLoadCallTime > 300 || bytesRead == contentLength) {
								downLoadCallTime = curTime;
								int progress = (int) (bytesRead * 100 / contentLength);
								if(listener != null)
									listener.onAlreadyDownLoadLength(bytesRead, contentLength, progress);
								log("onAlreadyDownLoadLength progress: " + progress);
							}
						}
						log("isContinue,file=" + file
								+ ",real read.size(0)=" + (bytesRead - fileLen)
								+ ",bytesRead=" + bytesRead
								+ ",fileLen=" + fileLen
								+ ",contentLength=" + contentLength);
						if(listener != null)
							listener.onDownLoadSuccess(true, tagName);
					} catch (Exception e) {
						e.printStackTrace();
						log("isContinue,Exception=" + e);
						if(listener != null)
							listener.onDownLoadSuccess(false, tagName);
					} finally {
						if (inputStream != null) {
							inputStream.close();
						}
						if (channelOut != null) {
							channelOut.close();
						}
						if (randomAccessFile != null) {
							randomAccessFile.close();
						}
					}
				} else {
					if(listener != null)
						listener.onDownLoadSuccess(false, tagName);
				}
			}
		});
	}

	/**
	 * 使用okhttp下载文件
	 *
	 * @param: raFile 文件
	 * @param: httpFileDownLoadUrl 文件网络路径
	 * @return: void
	 */
	public void executeHttpFile2(File raFile, String httpFileDownLoadUrl, String key, final OnHttpFileDownLoadListener listener) {
		final File file = raFile;
		final long fileLen = mListener.onSetRange()[0];
		final Request request1 = new Request.Builder()
				.url(httpFileDownLoadUrl)
				.addHeader("Range", "bytes=" + fileLen + "-")
				.build();

		//包装Response使其支持进度回调
		client.newCall(request1).enqueue(new Callback() {

			long downLoadCallTime;

			@Override
			public void onFailure(@NonNull Call call, @NonNull IOException e) {
				if(listener != null)
					listener.onDownLoadSuccess(false, key);
			}

			@Override
			public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
				log("response.isSuccessful(): " + response.isSuccessful() + "  response.body() != null: " + (response.body() != null));
				if (response.isSuccessful() && response.body() != null) {
					if(listener != null)
						listener.onPrepareDownLoad();
					final long contentLength = response.body().contentLength() + fileLen;
					if(listener != null)
						listener.onCheckHttpFileSize(true, contentLength);
					log("contentLength: " + contentLength);
					long bytesRead = fileLen;
					InputStream is = null;
					OutputStream fileOutputStream = null;
					try {
						is = response.body().byteStream();
						DiskLruCache.Editor editor = mDiskLruCache != null ? mDiskLruCache.edit(key) : null;
						if(editor != null) {
							fileOutputStream = editor.newOutputStream(0);
						} else {
							fileOutputStream = new FileOutputStream(file, true);
						}
						byte[] buffer = new byte[1024];//缓冲数组2kB
						int len;
						while ((len = is.read(buffer)) != -1) {
							fileOutputStream.write(buffer, 0, len);
							bytesRead += len;
							long curTime = SystemClock.elapsedRealtime();
							if (curTime - downLoadCallTime > 300 || bytesRead == contentLength) {
								downLoadCallTime = curTime;
								int progress = (int) (bytesRead * 100 / contentLength);
								if(listener != null)
									listener.onAlreadyDownLoadLength(bytesRead, contentLength, progress);
								log("onAlreadyDownLoadLength progress: " + progress);
							}
						}
//						fileOutputStream.flush();
						editor.commit();
						log("isContinue,file=" + file
								+ ",real read.size(0)=" + (bytesRead - fileLen)
								+ ",bytesRead=" + bytesRead
								+ ",fileLen=" + fileLen
								+ ",contentLength=" + contentLength);
						if(listener != null)
							listener.onDownLoadSuccess(true, key);
					} catch (Exception e) {
						e.printStackTrace();
						log("isContinue,Exception=" + e);
						if(listener != null)
							listener.onDownLoadSuccess(false, key);
					} finally {
						if(is != null) {
							is.close();
							is = null;
						}
						if(fileOutputStream != null) {
							fileOutputStream.close();
							fileOutputStream = null;
						}
					}
				} else {
					if(listener != null)
						listener.onDownLoadSuccess(false, key);
				}
			}
		});
	}

	/**
	 * 使用okhttp下载文件
	 *
	 * @param: raFile 文件
	 * @param: httpFileDownLoadUrl 文件网络路径
	 * @return: void
	 */
	public void executeHttpFile(File raFile, String httpFileDownLoadUrl, String tagName) {
		final File file = raFile;

		if (isCancel || file == null) {
			mListener.onDownLoadSuccess(false, "isCancel!");
			return;
		}

		if (mCurCall != null)
			mCurCall.cancel();

		final long fileLen = mListener.onSetRange()[0];
		final Request request1 = new Request.Builder()
				.url(httpFileDownLoadUrl)
				.addHeader("Range", "bytes=" + fileLen + "-")
				.build();

		if (fileLen > 0) {
			log("isContinue,file=" + file + ",fileLen=" + fileLen);
        }

		//包装Response使其支持进度回调
		(mCurCall = client.newCall(request1)).enqueue(new Callback() {

			long downLoadCallTime;

			@Override
			public void onFailure(@NonNull Call call, @NonNull IOException e) {
				mListener.onDownLoadSuccess(false, e.getMessage());
			}

			@Override
			public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
				log("response.isSuccessful(): " + response.isSuccessful() + "  response.body() != null: " + (response.body() != null));

//				int loop = 0;
				if (response.isSuccessful() && response.body() != null) {
					mListener.onPrepareDownLoad();
					final long contentLength = response.body().contentLength() + fileLen;
					mListener.onCheckHttpFileSize(true, contentLength);
					log("contentLength: " + contentLength);
					long bytesRead = fileLen;
					InputStream inputStream = null;
					FileChannel channelOut = null;
					RandomAccessFile randomAccessFile = null;
					try {
						inputStream = response.body().byteStream();
						randomAccessFile = new RandomAccessFile(file, "rwd");
						channelOut = randomAccessFile.getChannel();
						MappedByteBuffer mappedBuffer = channelOut.map(FileChannel.MapMode.READ_WRITE, bytesRead, contentLength);
						byte[] buff = new byte[1024 * 4];
						log("download complete1: " + ((int) (bytesRead * 100 / contentLength)));
						mListener.onAlreadyDownLoadLength(bytesRead, contentLength, (int) (bytesRead * 100 / contentLength));

						while (true) {
//							if(GlobalConfig.isTest() && !isNotFirst) {
//								if (loop >= 5) {
//									throw new Exception();
//								}
//								loop ++;
//								isNotFirst = true;
//								log(TAG, "===============> loop:" + loop);
//							}
							if (isCancel) {
								throw new IllegalStateException("cancel by user!");
							}

							int read = inputStream.read(buff);
							if (read == -1) {
								break;
							}
							bytesRead = bytesRead + read;
							mappedBuffer.put(buff, 0, read);
//							log("download complete2 read: " + read + "   bytesRead: " + bytesRead + "   progress: " + ((int) (bytesRead * 100 / contentLength)));
							// 避免过多调用，导致卡顿
							long curTime = SystemClock.elapsedRealtime();
							// ui层回调
							if (curTime - downLoadCallTime > 300 || bytesRead == contentLength) {
								downLoadCallTime = curTime;
								int progress = (int) (bytesRead * 100 / contentLength);
								mListener.onAlreadyDownLoadLength(bytesRead, contentLength, progress);
								log("onAlreadyDownLoadLength progress: " + progress);
							}
						}
						log("isContinue,file=" + file
								+ ",real read.size(0)=" + (bytesRead - fileLen)
								+ ",bytesRead=" + bytesRead
								+ ",fileLen=" + fileLen
								+ ",contentLength=" + contentLength);
						mListener.onDownLoadSuccess(true, response.message());
					} catch (Exception e) {
						e.printStackTrace();
						log("isContinue,Exception=" + e);
						mListener.onDownLoadSuccess(false, e.getMessage());
					} finally {
						if (inputStream != null) {
							inputStream.close();
						}
						if (channelOut != null) {
							channelOut.close();
						}
						if (randomAccessFile != null) {
							randomAccessFile.close();
						}
					}
				} else {
					mListener.onDownLoadSuccess(false, response.message());
				}
			}
		});
		log("isContinue,enqueue.call=" + mCurCall);
	}

	public void cancel() {
		isCancel = true;
		if (mCurCall != null) {
			mCurCall.cancel();
			Log.i("isContinue,", mCurCall + ",curCall cancel,isCancel=" + mCurCall.isCanceled());
		}
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	/***********************************************************************************************
	 *
	 * interface
	 *
	 ***********************************************************************************************/
	public interface OnHttpFileDownLoadListener {

		@CallSuper
		default void onPrepareDownLoad() {
//			AppUtil.checkTotalFreeSize(BaseApp.getInstance());
		}

		default void onCheckHttpFileSize(boolean isCheckSuccess, long fileTotalSize) {

		}

		@NonNull
		default long[] onSetRange() {
			return new long[]{0, 0};
		}

		default void onAlreadyDownLoadLength(long length, long total, int progress) {

		}

		default void onDownLoadSuccess(boolean success, String msg) {

		}

	}

	private void log(String msg) {
		System.out.println("=========================> " + msg);
	}

}

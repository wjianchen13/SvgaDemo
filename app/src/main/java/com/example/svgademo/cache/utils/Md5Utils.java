package com.example.svgademo.cache.utils;

import android.text.TextUtils;
import android.util.Base64;

import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class Md5Utils {

	private static String ENCODE = "UTF-8";//保持平台兼容统一使用utf-8
	private static String DES = "DES";

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String hashKeyForDisk(String key) {
		String cacheKey;
		try {
			final MessageDigest mDigest = MessageDigest.getInstance("MD5");
			mDigest.update(key.getBytes());
			cacheKey = bytesToHexString(mDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			cacheKey = String.valueOf(key.hashCode());
		}
		return cacheKey;
	}

	private static String bytesToHexString(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(0xFF & bytes[i]);
			if (hex.length() == 1) {
				sb.append('0');
			}
			sb.append(hex);
		}
		return sb.toString();
	}

	public static String DESAndBase64Decrypt(String dataBase64) {
		try {
			return DESAndBase64Decrypt(dataBase64, "MIIBIjANBgkqhkiG9w0B");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	// 服务端解密
	public static String DESAndBase64Decrypt(String dataBase64, String key) throws Exception {
		// Log.d("DESAndBase64Decrypt", dataBase64);
		if (!TextUtils.isEmpty(dataBase64) && dataBase64.length() > 6 && dataBase64.substring(0, 4).contains("http")) {
			return dataBase64;
		} else {
			if (TextUtils.isEmpty(dataBase64)) return null;
			byte[] encryptedData = Base64.decode(dataBase64, Base64.DEFAULT);
			byte[] decryptedData = decryptByteDES(encryptedData, key);
			return new String(decryptedData, ENCODE);
		}
		// LogUtil.d("DESAndBase64Decrypt", textDecrypt);
	}

	//des 解密
	private static byte[] decryptByteDES(byte[] byteD, String strKey) throws Exception {
		return doDecrypt(byteD, getKey(strKey), DES);
	}

	public static SecretKey getKey(String strKey) throws Exception {
		DESKeySpec desKeySpec = new DESKeySpec(strKey.getBytes());
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		return keyFactory.generateSecret(desKeySpec);
	}

	/**
	 * 执行解密操作
	 *
	 * @param data 待操作数据
	 * @param key  Key
	 * @param type 算法 RSA or DES
	 * @return
	 * @throws Exception
	 */
	private static byte[] doDecrypt(byte[] data, Key key, String type) throws Exception {
		Cipher cipher = Cipher.getInstance(type);
		cipher.init(Cipher.DECRYPT_MODE, key);
		return cipher.doFinal(data);
	}

}

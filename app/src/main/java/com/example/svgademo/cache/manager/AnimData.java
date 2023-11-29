package com.example.svgademo.cache.manager;

import com.example.svgademo.Utils;
import com.example.svgademo.cache.utils.Md5Utils;

public class AnimData {

    private String vggUrl;
    private String mUrl;
    private String key;

    public AnimData(String url) {
        this.vggUrl = url;
        this.mUrl = Md5Utils.DESAndBase64Decrypt(vggUrl);
        this.key = Md5Utils.hashKeyForDisk(url);
        Utils.log("vggUrl: " + vggUrl + "   mUrl: " + mUrl + "   key : " + key);
    }

    public String getVggUrl() {
        return vggUrl;
    }

    public void setVggUrl(String vggUrl) {
        this.vggUrl = vggUrl;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

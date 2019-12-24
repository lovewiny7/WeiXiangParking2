package com.global.winy7.broadcastutil;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/**
 * <pre>
 *     desc   : 广播
 *     author : winy7
 *     time   : 2019/06/13
 *     e-mail : 347267801@qq.com
 *     version: 1.0
 * </pre>
 */
public class BCUtil {
    
    public static String SIGN_ADDRESS = "ADD_ADDRESS";   // 打卡位置
    public static String DEL_ADDRESS = "DEL_ADDRESS";   // 删除地址
    public static String EDIT_ADDRESS = "EDIT_ADDRESS"; // 修改地址
    

    
    public static Intent sendBroadcastIntent(String key) {
        
        Intent intent = new Intent();
        intent.setAction(key);
        return intent;
    }
    public static Intent sendBroadcastIntent(String key, String value) {
        
        Intent intent = new Intent();
        intent.putExtra(key,value);
        intent.setAction(key);
        return intent;
    }
    
    private class myBroadcastReceiver extends BroadcastReceiver {
    
    
        @Override
        public void onReceive(Context context, Intent intent) {
        
        }
    }
    
    public static IntentFilter getBroadcastIntent(String key) {
        
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(key);
        return intentFilter;
        
    }
}

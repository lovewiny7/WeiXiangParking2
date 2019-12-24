package com.global.winy7;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.UnderlineSpan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <pre>
 *     desc   : 关键字变色 +下划线+字体大小修改
 *     author : winy7
 *     time   : 2019/12/10
 *     e-mail : 347267801@qq.com
 *     version: 1.0
 * </pre>
 */
public class KeyWordUtil {
    /**
     * @param color 文字颜色
     * @param str   原文字
     * @param key   需要修改的文字（多个关键字）
     * @return 加完样式的文字
     */
    public static SpannableString changeKeyColor(int color, String str, String[] key) {
        
        SpannableString spannableString = new SpannableString(str);
        for (String aKey : key) {
            
            Pattern pattern = Pattern.compile(aKey);
            Matcher matcher = pattern.matcher(spannableString);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                spannableString.setSpan(new ForegroundColorSpan(color), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            }
            
        }
        
        return spannableString;
    }
    
    /**
     * @param color 文字颜色
     * @param str   原文字
     * @param key   需要修改的文字（单个关键字）
     * @return 加完样式的文字
     */
    
    public static SpannableString changeKeyColor(int color, String str, String key) {
        
        SpannableString spannableString = new SpannableString(str);
        
        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(spannableString);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannableString.setSpan(new ForegroundColorSpan(color), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            spannableString.setSpan(new UnderlineSpan(), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            
            
        }
        return spannableString;
    }
    
    
    /**
     * @param str      原文字
     * @param key      需要修改的文字（多个关键字）
     * @param textSize 字体大小 相对原字体的倍数
     * @return 加完样式的文字（下划线+字体大小）
     */
    public static SpannableString underLineKey(String str, String[] key, float textSize) {
        
        SpannableString spannableString = new SpannableString(str);
        for (String aKey : key) {
            
            Pattern pattern = Pattern.compile(aKey);
            Matcher matcher = pattern.matcher(spannableString);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                spannableString.setSpan(new UnderlineSpan(), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
                spannableString.setSpan(new RelativeSizeSpan(textSize), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            }
            
        }
        
        return spannableString;
    }
    
    /**
     * @param str      原文字
     * @param key      需要修改的文字（单个关键字）
     * @param textSize 字体大小 相对原字体的倍数
     * @return 加完样式的文字（下划线+字体大小）
     */
    
    public static SpannableString underLineKey(String str, String key, float textSize) {
        
        SpannableString spannableString = new SpannableString(str);
        
        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(spannableString);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            spannableString.setSpan(new UnderlineSpan(), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            spannableString.setSpan(new RelativeSizeSpan(textSize), start, end, SpannableString.SPAN_INCLUSIVE_EXCLUSIVE);
            
        }
        return spannableString;
    }
}

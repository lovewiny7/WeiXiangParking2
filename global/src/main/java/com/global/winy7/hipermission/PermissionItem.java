package com.global.winy7.hipermission;

import com.global.R;

import java.io.Serializable;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.CAMERA;
import static android.Manifest.permission.READ_PHONE_STATE;
import static android.Manifest.permission.SEND_SMS;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;


/**
 * Created by Administrator on 2017/5/10 0010.
 */

public class PermissionItem implements Serializable {
    public String PermissionName; //权限名称，为用户展示
    public String Permission; //需要的权限
    public int PermissionIconRes; //权限图片，为用户展示
    
    private String mPermissions[] = {CAMERA, ACCESS_FINE_LOCATION, READ_PHONE_STATE, SEND_SMS, WRITE_EXTERNAL_STORAGE};
    private String permissionNames[] = {"相机", "位置", "手机", "短信", "存储",};
    private int permissionIconRes[] = {R.mipmap.permission_ic_camera, R.mipmap.permission_ic_location,
            R.mipmap.permission_ic_phone, R.mipmap.permission_ic_sms, R.mipmap.permission_ic_storage,};
    
    public PermissionItem() {
    }
    
    public PermissionItem(String permission, String permissionName, int permissionIconRes) {
        Permission = permission;
        PermissionName = permissionName;
        PermissionIconRes = permissionIconRes;
    }
    
    public PermissionItem(String permission) {
        Permission = permission;
    }
    
    public  PermissionItem getPermissionItem(String type) {
        int i = 0;
        switch (type) {
            case "相机": {
                i = 0;
                break;
            }
            case "位置": {
                i = 1;
                break;
            }
            case "手机": {
                i = 2;
                break;
            }
            case "短信": {
                i = 3;
                break;
            }
            case "存储": {
                i = 4;
                break;
            }
        }
        return new PermissionItem(mPermissions[i], permissionNames[i], permissionIconRes[i]);
    }
}

package com.weixiang.parking.gaodemap.util;

import android.content.Context;

import com.amap.api.maps.model.LatLng;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeSearch;

/**
 * <pre>
 *     desc   :
 *     author : winy7
 *     time   : 2019/12/23
 *     e-mail : 347267801@qq.com
 *     version: 1.0
 * </pre>
 */
public class GeocodeUitl {
    

    //地理编码（地址转坐标）
    public static void addressChangeLat(Context context,GeocodeSearch.OnGeocodeSearchListener listener,
                                  String city) {
//        String arrived = end_et.getText().toString();
        GeocodeSearch geocoderSearch = new GeocodeSearch(context);
        geocoderSearch.setOnGeocodeSearchListener(listener);
        // name表示地址，第二个参数表示查询城市，中文或者中文全拼，citycode、adcode
        GeocodeQuery query = new GeocodeQuery(city, city);
        geocoderSearch.getFromLocationNameAsyn(query);
    }
}

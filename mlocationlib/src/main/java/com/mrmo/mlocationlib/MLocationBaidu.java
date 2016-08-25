package com.mrmo.mlocationlib;

import android.content.Context;
import android.util.Log;

/**
 * 百度定位.暂时未添加开发包,若使用请添加开发包
 * Created by moguangjian on 16/8/24 14:32.
 */
public class MLocationBaidu implements MLocationAble {

    private static final String TAG = MLocationBaidu.class.getSimpleName();
    private Context context;
    private OnMLocationListener onMLocationListener;
//    private LocationClient locationClient;
//    private BDLocationListener bdLocationListener;

    public MLocationBaidu(Context context) {
        this.context = context;
        init();
    }

    @Override
    public void start() {
        Log.e(TAG, "定位失败. 暂时未添加开发包,若使用请添加开发包");
//        locationClient.start();
    }

    @Override
    public void stop() {
//        locationClient.stop();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void setMLocationLister(OnMLocationListener onMLocationListener) {
        this.onMLocationListener = onMLocationListener;
    }

    private void init() {
        /*
        locationClient = new LocationClient(context);

        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);//可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
        option.setCoorType("bd09ll");//可选，默认gcj02，设置返回的定位结果坐标系
        option.setScanSpan(3000);//可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
        option.setIsNeedAddress(true);//可选，设置是否需要地址信息，默认不需要
        option.setOpenGps(true);//可选，默认false,设置是否使用gps
        option.setLocationNotify(true);//可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
        option.setIsNeedLocationDescribe(false);//可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
        option.setIsNeedLocationPoiList(false);//可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
        option.setIgnoreKillProcess(false);//可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
        option.SetIgnoreCacheException(false);//可选，默认false，设置是否收集CRASH信息，默认收集
        option.setEnableSimulateGps(false);//可选，默认false，设置是否需要过滤gps仿真结果，默认需要
        locationClient.setLocOption(option);

        bdLocationListener = new BDLocationListener() {
            @Override
            public void onReceiveLocation(BDLocation location) {
                //Receive Location
                StringBuffer sb = new StringBuffer(256);
                sb.append("time : ");
                sb.append(location.getTime());
                sb.append("\nerror code : ");
                sb.append(location.getLocType());
                sb.append("\nlatitude : ");
                sb.append(location.getLatitude());
                sb.append("\nlontitude : ");
                sb.append(location.getLongitude());

                if (location.getLocType() == BDLocation.TypeGpsLocation
                        || location.getLocType() == BDLocation.TypeNetWorkLocation
                        || location.getLocType() == BDLocation.TypeOffLineLocation) {
                    MLocationModel mLocationModel = new MLocationModel();
                    mLocationModel.setLat(location.getLatitude());
                    mLocationModel.setLng(location.getLongitude());
                    mLocationModel.setProvince(location.getProvince());
                    mLocationModel.setCity(location.getCity());
                    mLocationModel.setDistrict(location.getDistrict());
                    mLocationModel.setStreet(location.getStreet());
                    mLocationModel.setAddress(location.getAddrStr());

                    sb.append("\naddr : ");
                    sb.append(location.getAddrStr());
                    sb.append("\ndescribe : ");
                    sb.append("定位成功");

                    if (onMLocationListener != null) {
                        onMLocationListener.onLocation(mLocationModel);
                    }

                }
                Log.i("location address:", sb.toString());
            }
        };

        locationClient.registerLocationListener(bdLocationListener);
        */
    }
}
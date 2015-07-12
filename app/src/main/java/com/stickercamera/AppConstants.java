package com.stickercamera;

import android.os.Environment;

/**
 * Created by sky on 2015/7/6.
 */
public class AppConstants {

    public static final String APP_DIR        = Environment.getExternalStorageDirectory() + "/StickerCamera";
    public static final String APP_TEMP       = APP_DIR + "/temp";
    public static final String APP_IMAGE      = APP_DIR + "/image";

    public static final int    POST_TYPE_POI              = 1;
    public static final int    POST_TYPE_TAG              = 0;
    public static final int    POST_TYPE_DEFAULT		  = 0;


    public static final float  DEFAULT_PIXEL              = 1242;                           //按iphone6设置

}

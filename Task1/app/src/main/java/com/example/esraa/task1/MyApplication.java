package com.example.esraa.task1;

import android.app.Application;
import android.app.Application;
import android.text.TextUtils;


/**
 * Created by esraa on 04/06/18.
 */

public class MyApplication extends Application {
    public static final String TAG = MyApplication.class
            .getSimpleName();

    //private RequestQueue mRequestQueue;

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}

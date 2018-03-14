package com.shuja1497.retrofitwithimgurapi;

import android.app.Application;
import com.shuja1497.retrofitwithimgurapi.api.OAuthUtil;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // ensure the shared pref is initialized with the Global Context
        OAuthUtil.initSharedPref(this);
    }
}

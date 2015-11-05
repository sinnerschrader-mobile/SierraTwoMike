package com.sinnerschradermobile.android.sierratwomike.base;

import android.app.Application;

/**
 * This application class needs to be set inside your AndroidManifest as the application.
 * <p/>
 * Normally done by using the android:name attribute in the application-tag.
 *
 * @author Martin Breuer
 */
public class SupportApplication extends Application {
    private static SupportApplication sInstance;

    public static SupportApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}

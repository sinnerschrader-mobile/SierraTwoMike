package com.sinnerschradermobile.android.sierratwomike.root;

import android.app.Application;

import org.androidannotations.annotations.EApplication;

/**
 * This application class needs to be set inside your AndroidManifest as the application.
 * <p/>
 * Normally done by using the android:name attribute in the application-tag.
 *
 * @author Martin Breuer
 */
@EApplication
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

package com.sinnerschradermobile.android.sierratwomike.util;

import android.support.annotation.StringRes;

import com.sinnerschradermobile.android.sierratwomike.base.SupportApplication;

/**
 * @author Martin Breuer
 */
public final class AndroidUtils {
    private AndroidUtils() {
        // utils class do not need a public constructor
    }

    public static String getString(@StringRes final int stringId) {
        return SupportApplication.getInstance().getString(stringId);
    }

    public static String getString(@StringRes final int stringRes, final Object... params) {
        return SupportApplication.getInstance().getString(stringRes, params);
    }
}

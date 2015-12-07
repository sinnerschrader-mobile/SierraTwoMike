package com.sinnerschradermobile.android.sierratwomike.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * @author Martin Breuer
 */
public final class AndroidUtils {
    private AndroidUtils() {
        // utils class do not need a public constructor
    }

    public static String getString(@NonNull Context context, @StringRes final int stringId) {
        return context.getString(stringId);
    }

    public static String getString(@NonNull Context context, @StringRes final int stringRes, final Object... params) {
        return context.getString(stringRes, params);
    }
}

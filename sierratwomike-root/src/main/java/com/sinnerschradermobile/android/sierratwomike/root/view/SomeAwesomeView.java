package com.sinnerschradermobile.android.sierratwomike.root.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import org.androidannotations.annotations.EViewGroup;

/**
 * @author Martin Breuer
 */
@EViewGroup(resName = "viewgroup_awesome")
public class SomeAwesomeView extends RelativeLayout {
    public SomeAwesomeView(final Context context) {
        super(context);
    }

    public SomeAwesomeView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public SomeAwesomeView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

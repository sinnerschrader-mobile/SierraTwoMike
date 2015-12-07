package com.sinnerschradermobile.android.sierratwomike.demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.sinnerschradermobile.android.sierratwomike.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * @author Martin Breuer
 */
@EActivity(R.layout.activity_demo)
public class DemoActivity extends AppCompatActivity {
    @ViewById(R.id.toast_button)
    Button mButton;

    @Click(R.id.toast_button)
    void onButtonClick() {
        Toast.makeText(this, "Button pressed", Toast.LENGTH_SHORT).show();
    }
}

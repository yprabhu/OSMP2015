package com.yprabhu.osmp2015;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by yprabhu on 8/4/15.
 */
public class SecondaryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        TextView textView = (TextView) findViewById(R.id.secondary_text_view);
        textView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}

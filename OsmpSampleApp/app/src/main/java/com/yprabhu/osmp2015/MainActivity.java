package com.yprabhu.osmp2015;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    public static final String EXTRA_MESSAGE = "Hello OSMP!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);
        String message = getResources().getString(R.string.hello_osmp);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}

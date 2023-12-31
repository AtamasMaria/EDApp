package com.codingwithme.p0271_getintentaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTime = (Button) findViewById(R.id.btnTime);
        Button btnDate = (Button) findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        int id = v.getId();
        if (id == R.id.btnTime) {
            intent = new Intent("ru.startandroid.intent.action.showtime");
            startActivity(intent);
        } else if (id == R.id.btnDate) {
            intent = new Intent("ru.startandroid.intent.action.showdate");
            startActivity(intent);
        }
    }
}
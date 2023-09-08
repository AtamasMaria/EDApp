package com.codingwithme.p0261_intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnDate = (Button) findViewById(R.id.btnDate);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.btnTime) {
            intent = new Intent("ru.startandroid.intent.action.showtime");
            startActivity(intent);
        } else if (view.getId() == R.id.btnDate) {
            intent = new Intent("ru.startandroid.intent.action.showdate");
            startActivity(intent);
        }
    }
}
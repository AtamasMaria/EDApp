package com.codingwithme.p0261_intentfilter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends Activity implements View.OnClickListener {

    Button btnPrev;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(date);

        btnPrev = (Button) findViewById(R.id.buttonPrevDate);
        btnPrev.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.buttonPrevDate) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
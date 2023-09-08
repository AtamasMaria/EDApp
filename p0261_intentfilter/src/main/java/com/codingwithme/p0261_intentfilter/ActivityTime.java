package com.codingwithme.p0261_intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ActivityTime extends Activity implements View.OnClickListener {

    Button btnPrev;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView textView = (TextView) findViewById(R.id.tvTime);
        textView.setText(time);

        btnPrev = (Button) findViewById(R.id.buttonPrev);
        btnPrev.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.buttonPrev) {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
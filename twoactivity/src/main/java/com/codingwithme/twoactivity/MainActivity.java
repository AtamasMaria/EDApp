package com.codingwithme.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnTwoAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTwoAct = (Button) findViewById(R.id.ntnActTwo);
        btnTwoAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ntnActTwo) {
           Intent intent = new Intent(this, ActivityTwo.class);
           startActivity(intent);
        }
    }
}
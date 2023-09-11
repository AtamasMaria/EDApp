package com.codingwithme.p0301_activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements View.OnClickListener {

    final int REQUEST_CODE_COLOR = 1;
    final int REQUEST_CODE_ALIGN = 2;
    TextView tvText;
    Button btnColor;
    Button btnAlign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvText);

        btnColor = (Button) findViewById(R.id.btnColor);
        btnColor.setOnClickListener(this);

        btnAlign = (Button) findViewById(R.id.btnAlign);
        btnAlign.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view.getId() == R.id.btnColor) {
            intent = new Intent(this, ColorActivity.class);
            startActivityForResult(intent, REQUEST_CODE_COLOR);
        } else if (view.getId() == R.id.btnAlign) {
            intent = new Intent(this, AlignActivity.class);
            startActivityForResult(intent, REQUEST_CODE_ALIGN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d("myLogs", "requestCode = " + requestCode + ", resultCode = " + resultCode);

        if (resultCode == RESULT_OK) {
            if (resultCode == REQUEST_CODE_COLOR) {
                int color = data.getIntExtra("color", Color.WHITE);
                tvText.setTextColor(color);
            } else if (resultCode == REQUEST_CODE_ALIGN) {
                int align = data.getIntExtra("alignment", Gravity.LEFT);
                tvText.setGravity(align);
            }
        } else {
            Toast.makeText(this, "Wrong result", Toast.LENGTH_SHORT).show();

        }
    }
}
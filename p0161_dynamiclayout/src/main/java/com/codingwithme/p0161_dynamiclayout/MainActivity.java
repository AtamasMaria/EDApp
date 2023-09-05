package com.codingwithme.p0161_dynamiclayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        setContentView(linearLayout, layoutParams);

        LayoutParams lpView = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setLayoutParams(lpView);
        linearLayout.addView(textView);

        Button btn = new Button(this);
        btn.setText("Это кнопка");
        btn.setLayoutParams(lpView);
        linearLayout.addView(btn);

    }
}
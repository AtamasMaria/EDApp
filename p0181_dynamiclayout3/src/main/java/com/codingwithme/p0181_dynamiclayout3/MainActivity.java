package com.codingwithme.p0181_dynamiclayout3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    SeekBar sbWeight;
    Button btn1;
    Button btn2;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = (SeekBar) findViewById(R.id.sbWeight);
        sbWeight.setOnSeekBarChangeListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) { //срабатывает все время, пока значение меняется
        int leftValue = progress; //текущее значение SeekBar, т.е. то что слева от ползунка
        int rightValue = seekBar.getMax() - progress; //то, что справа от ползунка, т.е. из максимума вычесть текущее значение

        lParams1.weight = leftValue;
        lParams2.weight = rightValue;

        btn1.setText(String.valueOf(leftValue));
        btn2.setText(String.valueOf(rightValue));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) { //срабатывает, когда начинаем тащить ползунок

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) { //срабатывает, когда отпускаем ползунок

    }
}
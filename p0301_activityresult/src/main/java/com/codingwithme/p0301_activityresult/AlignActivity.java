package com.codingwithme.p0301_activityresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AlignActivity extends Activity implements OnClickListener {

    Button btnLeft;
    Button btnCenter;
    Button btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.align);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnCenter = (Button) findViewById(R.id.btnCenter);
        btnRight = (Button) findViewById(R.id.btnRight);

        btnLeft.setOnClickListener(this);
        btnCenter.setOnClickListener(this);
        btnRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        int id = v.getId();
        if (id == R.id.btnLeft) {
            intent.putExtra("alignment", Gravity.LEFT);
        } else if (id == R.id.btnCenter) {
            intent.putExtra("alignment", Gravity.CENTER);
        } else if (id == R.id.btnRight) {
            intent.putExtra("alignment", Gravity.RIGHT);
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}
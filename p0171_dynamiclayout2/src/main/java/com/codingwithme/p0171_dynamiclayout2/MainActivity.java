package com.codingwithme.p0171_dynamiclayout2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;
    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.LLMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        etName = (EditText) findViewById(R.id.EditName);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnClear = (Button) findViewById(R.id.btnCleare);

        btnCreate.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnCreate) {
            LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                    wrapContent, wrapContent);
            int btnGravity = Gravity.LEFT;
            int checkedRadioButtonId = rgGravity.getCheckedRadioButtonId();
            if (checkedRadioButtonId == R.id.rbLeft) {
                btnGravity = Gravity.LEFT;
            } else if (checkedRadioButtonId == R.id.rbCenter) {
                btnGravity = Gravity.CENTER_HORIZONTAL;
            } else if (checkedRadioButtonId == R.id.rbRight) {
                btnGravity = Gravity.RIGHT;
            }
            lParams.gravity = btnGravity;

            Button btnNew = new Button(this);
            btnNew.setText(etName.getText().toString());
            llMain.addView(btnNew, lParams);
        } else if (id == R.id.btnCleare) {
            llMain.removeAllViews();
            Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
        }
    }
}
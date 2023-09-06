package com.codingwithme.p0191_simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;
    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(this);

        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);

        btnMult = (Button) findViewById(R.id.btnMult);
        btnMult.setOnClickListener(this);

        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    @Override
    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (etNum1.getText().toString().isEmpty() || etNum2.getText().toString().isEmpty()) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        int id = view.getId();
        if (id == R.id.btnAdd) {
            oper = "+";
            result = num1 + num2;
        } else if (id == R.id.btnSub) {
            oper = "-";
            result = num1 - num2;
        } else if (id == R.id.btnMult) {
            oper = "*";
            result = num1 * num2;
        } else if (id == R.id.btnDiv) {
            oper = "/";
            result = num1 / num2;
        }

        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:
                // очищаем поля
                etNum1.setText("");
                etNum2.setText("");
                tvResult.setText("");
                break;
            case MENU_QUIT_ID:
                // выход из приложения
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
package com.bignerbranch.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    CheckBox cbStatus;
    RadioButton rbMale;
    RadioButton rbFemale;
    Switch swGrade;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbStatus = (CheckBox) findViewById(R.id.cbStatus);
        rbMale = (RadioButton) findViewById(R.id.rbMale);
        tvResult= (TextView) findViewById(R.id.tvResult);
        rbFemale = (RadioButton) findViewById(R.id.rbMale);;
        swGrade = (Switch) findViewById(R.id.swGrade);
    }

    public void buCheck(View view){
        String result = "";
        if (cbStatus.isChecked())
            result = " he is married, ";
        else
            result = " he is not married";

        if (rbMale.isChecked())
            result += " also he is male, ";
        else 
            result += " also he is female, ";

        if (swGrade.isChecked())
            result += " ,also this student is graduated";
        else
            result += " , also this student isn't graduated";

        tvResult.setText(result);

        }

    }


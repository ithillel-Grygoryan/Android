package com.bignerbranch.android.calculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etn1;
    EditText etn2;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void buClick(View view){
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1+n2;
        tvResult.setText(sum);

    }
}

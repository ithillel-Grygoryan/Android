package com.bignerbranch.android.demoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buClick(View view){

        String msg = getResources().getString(R.string.msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}

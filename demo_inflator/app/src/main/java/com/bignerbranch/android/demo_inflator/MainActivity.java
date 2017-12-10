package com.bignerbranch.android.demo_inflator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buShow(View view){
        LayoutInflater myLayoutInflater = getLayoutInflater();
        View view1 = myLayoutInflater.inflate(R.layout.showlayout, null);
        EditText et1 = (EditText) view1.findViewById(R.id.editText);
        et1.setText("Welcome");
        Toast toast = new Toast(getApplicationContext());
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
    }
}

package com.bignerbranch.android.findmyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {

    EditText etShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        etShow = (EditText) findViewById(R.id.etShow);
        Bundle b = getIntent().getExtras();
        String name = b.getString("name");
        etShow.setText(name);
    }

    public void buLogin(View view){
        finish();
    }


}

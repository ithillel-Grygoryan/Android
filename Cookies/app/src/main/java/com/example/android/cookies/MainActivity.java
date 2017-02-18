package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void eating(View view){
        TextView eatingTextView = (TextView) findViewById(R.id.text_view);
        eatingTextView.setText("I'm full!");
        ImageView after_cookie = (ImageView) findViewById(R.id.image_view);
        after_cookie.setImageResource(R.drawable.after_cookie);
    }
}

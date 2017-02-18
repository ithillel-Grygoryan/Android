package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView item1 = (TextView) findViewById(R.id.menu_item_1);
        Log.i("Menu item1 ",item1.getText().toString());
        TextView item2 = (TextView) findViewById(R.id.menu_item_2);
        Log.i("Menu item2 ",item2.getText().toString());
        TextView item3 = (TextView) findViewById(R.id.menu_item_3);
        Log.i("Menu item3 ",item3.getText().toString());
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}
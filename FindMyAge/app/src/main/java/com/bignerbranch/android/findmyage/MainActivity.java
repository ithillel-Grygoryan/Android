 package com.bignerbranch.android.findmyage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     EditText etUserName;
     EditText etPassword;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         etUserName = (EditText) findViewById(R.id.etUserName);
         etPassword = (EditText) findViewById(R.id.etPassword);
     }

     String username = "admin";
     String password = "1111";
     String name = "Olechka Lamzaki";

     public void buLogin(View view) {
         if (username.equals(etUserName.getText().toString()) &&
                 password.equals(etPassword.getText().toString())) {
             Intent intent = new Intent(this, Welcome.class);
             intent.putExtra("name", name);
             startActivity(intent);

         }
     }

     @Override
     protected void onStart() {
         super.onStart();
         Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onStop() {
         super.onStop();
         Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onResume() {
         super.onResume();
         Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onPause() {
         super.onPause();
         Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
     }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
     }
 }

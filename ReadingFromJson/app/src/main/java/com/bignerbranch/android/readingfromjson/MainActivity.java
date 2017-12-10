package com.bignerbranch.android.readingfromjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String JsonFromURL="{"+
                "'info':{'name':'hussein,'age':27}"+
                "'jobs':"+
                "["+
                "{'id':1,'title':'developer','desc':'nyc'},"+
                "{'id':2,'title':'developer','desc':'nyc'},"+
                "{'id':3,'title':'developer','desc':'nyc'},"+
                "]"+
                "}";

        try {
            JSONObject json = new JSONObject(JsonFromURL);
            JSONObject info = json.getJSONObject("info");
            String name = info.getString("name");
            int age = info.getInt("age");
            JSONArray jobs = json.getJSONArray("jobs");
            for (int i = 0; i < jobs.length(); i++){
                JSONObject job = jobs.getJSONObject(i);
                String title = job.getString("title");
                String desc = job.getString("desc");
                int id = job.getInt("id");
            }
        }
        catch (Exception exception){}

    }
}

package com.bignerbranch.android.demo_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.bignerbranch.android.demo_listview.R.id.lvList;
import static com.bignerbranch.android.demo_listview.R.id.tvDesk;
import static com.bignerbranch.android.demo_listview.R.id.tvId;

public class MainActivity extends AppCompatActivity {
    MyCustomAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<AdapterItems>    listnewsData = new ArrayList<AdapterItems>();
        MyCustomAdapter myadapter;

        ListView lvList = (ListView) findViewById(R.id.lvList);

        //add data and view it
        listnewsData.add(new AdapterItems(1,"developer"," develop apps"));
        listnewsData.add(new AdapterItems(2,"developer2"," develop apps"));
        listnewsData.add(new AdapterItems(3,"developer3"," develop apps"));
        listnewsData.add(new AdapterItems(4,"developer4"," develop apps"));

        myadapter=new MyCustomAdapter(listnewsData);
        lvList.setAdapter(myadapter);


    }


    //display news list
    private class MyCustomAdapter extends BaseAdapter {
        public ArrayList<AdapterItems> listnewsData ;

        public MyCustomAdapter(ArrayList<AdapterItems>  listnewsDataAdpater) {
            this.listnewsData=listnewsDataAdpater;
        }


        @Override
        public int getCount() {
            return listnewsData.size();
        }

        @Override
        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater mInflater = getLayoutInflater();
            View myView = mInflater.inflate(R.layout.layout_ticket, null);

            final   AdapterItems s = listnewsData.get(position);

            TextView tvTitle=( TextView)myView.findViewById(R.id.tvTitle);
            tvTitle.setText(s.JobTitle);

            tvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), s.JobTitle, Toast.LENGTH_LONG).show();
                }
            });

            TextView tvId=( TextView)myView.findViewById(R.id.tvId);
            tvId.setText("ID: "+s.ID);

            TextView tvDesk=( TextView)myView.findViewById(R.id.tvDesk);
            tvDesk.setText(s.Description);


            return myView;
        }

        public void addNew(View view){
            listnewsData.add(new AdapterItems(55, "added", "develop apps"));
            myadapter.notifyDataSetChanged();

        }


    }
}

package com.bignerbranch.android.demo_listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by becha on 8/10/17.
 */

public class AdapterItems {
        public   int ID;
        public  String JobTitle;
        public  String Description;
//for news details
        AdapterItems( int ID, String JobTitle,String Description)
        {
            this. ID=ID;
            this. JobTitle=JobTitle;
            this. Description=Description;
        }
    }

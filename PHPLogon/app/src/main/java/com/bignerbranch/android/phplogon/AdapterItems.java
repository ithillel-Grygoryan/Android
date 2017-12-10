package com.bignerbranch.android.phplogon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by becha on 11/28/17.
 */

public class AdapterItems
{
    public   int ID;
    public  String UserName;
    public  String Password;
    //for news details
    AdapterItems(int ID, String UserName, String Password)
    {
        this. ID=ID;
        this.UserName = UserName;
        this.Password=Password;
    }
}

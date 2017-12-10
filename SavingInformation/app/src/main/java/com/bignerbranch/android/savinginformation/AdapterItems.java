package com.bignerbranch.android.savinginformation;

/**
 * Created by becha on 9/1/17.
 */

public class AdapterItems
{
    public  int ID;
    public  String UserName;
    public  String Password;
    //for news details
    AdapterItems( int ID, String UserName,String Password)
    {
        this.ID = ID;
        this.UserName = UserName;
        this.Password = Password;
    }
}
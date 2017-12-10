package com.bignerbranch.android.popup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if (intent.getAction().equalsIgnoreCase("com.alraby.alarm")) {
            Bundle b = intent.getExtras();
            Toast.makeText(context, b.getString("MyMessage"), Toast.LENGTH_LONG).show();
        }
        }
    }


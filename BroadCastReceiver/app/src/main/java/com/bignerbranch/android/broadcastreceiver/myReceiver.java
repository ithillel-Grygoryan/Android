package com.bignerbranch.android.broadcastreceiver;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by becha on 9/14/17.
 */

public class myReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();


        if (intent.getAction().equalsIgnoreCase("com.example.Broadcast")) {
            String msg = bundle.getString("msg");
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equalsIgnoreCase("android.provider.Telephony.SMS_RECEIVED")) {

            if (bundle != null) {

                final Object[] pdusObj = (Object[]) bundle.get("pdus");
                SmsMessage[] messages = new SmsMessage[pdusObj.length];
                for (int i = 0; i < messages.length; i++) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        String format = bundle.getString("format");
                        messages[i] = SmsMessage.createFromPdu((byte[]) pdusObj[i], format);
                    } else {
                        messages[i] = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
                    }
                    // SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
                    String senderNum = messages[i].getOriginatingAddress();
                    String message = messages[i].getMessageBody();//
                    Toast.makeText(context, senderNum+" : "+ message, Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}

package com.bignerbranch.android.broadcastreceiver;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by becha on 9/25/17.
 */

public class MyService extends IntentService     {
    public static boolean IsRunning = false;
    public MyService() {
        super("myService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        // background code running
        while (IsRunning)
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                R
            }


    }
}

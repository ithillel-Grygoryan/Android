package com.bignerbranch.android.seekbarandthread;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar sb1;
    int maxCounter=100;
    TextView tvCounter;
    myHandler handle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1 = (SeekBar) findViewById(R.id.sb1);
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        sb1.setMax(maxCounter);
        handle=new myHandler();


    }

    boolean isRunning = false;
    int counterUp = 0;

    public void buStart(View view) {
        isRunning = true;
        myThread t = new myThread();
        t.start();
    }

    public void buStop(View view) {
        isRunning = false;
    }

    class myThread extends Thread{
        @Override
        public void run(){
            while (isRunning){
                if(counterUp<=maxCounter) {

                    //handler
                    Message msg = handle.obtainMessage();
                    Bundle b = new Bundle();
                    b.putInt("counter", counterUp);
                    msg.setData(b);
                    handle.sendMessage(msg);

                    counterUp++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }


    }
    class myHandler extends Handler{
        public void handleMessage(Message msg){
            int count=msg.getData().getInt("counter");
            sb1.setProgress(count);
            tvCounter.setText("Counter = "+count);
        }
    }
}

 package com.bignerbranch.android.jobserviceudemy;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int jobId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //job info
        JobInfo.Builder builder = new JobInfo.Builder(jobId,
                new ComponentName(this, MyJobService.class));
        builder.setMinimumLatency(1000);
        builder.setOverrideDeadline(2000);

        //send job to system
        JobScheduler jobScheduler = (JobScheduler)
                getSystemService(Context.JOB_SCHEDULER_SERVICE);
            jobScheduler.schedule(builder.build());
    }
}

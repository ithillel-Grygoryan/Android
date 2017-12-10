package com.bignerbranch.android.jobserviceudemy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by becha on 10/3/17.
 */

public class MyJobService extends JobService{
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.i("Job","Job is started");
        //call HTTP
        boolean isFail = true;//getting from http
        jobFinished(jobParameters, isFail);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

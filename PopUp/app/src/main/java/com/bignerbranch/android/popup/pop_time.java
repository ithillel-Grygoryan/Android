package com.bignerbranch.android.popup;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by becha on 8/24/17.
 */

public class pop_time extends DialogFragment implements View.OnClickListener {
    View view;
    TimePicker dp;
    Button bu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dp = (TimePicker) view.findViewById(R.id.tp1);
        view = inflater.inflate(R.layout.pop_time,container,false);
        bu = (Button) view.findViewById(R.id.bu1);
        bu.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v){
        this.dismiss();
        MainActivity ma = (MainActivity)getActivity();
        ma.SetTime(dp.getHour(), dp.getMinute());
    }


}

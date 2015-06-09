package com.twm.pt.myapplication.Activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.twm.pt.myapplication.R;
import com.twm.pt.myapplication.Utility.L;

public class BasicTypeActivity extends ActionBarActivity {

    private int fisrtNum,secondNum;
    private String firstStr,secondStr;
    private boolean is_fisrt_Big_ThanSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_type);


        fisrtNum = 1;
        secondNum = 2;
        int total = fisrtNum+secondNum;
        L.d("this is two number add result = " + total);

        firstStr = "1";
        secondStr = "2";
        String totalStr = firstStr+secondStr;
        L.d("this is two String add result = " + totalStr);


        if(secondNum>fisrtNum){
            L.d("this is true");
        }else{
            L.d("this is false");
        }

    }

}

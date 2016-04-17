package com.example.jeremy.myapplication.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.jeremy.myapplication.MainActivity;
import com.example.jeremy.myapplication.R;

/**
 * Created by Jeremy on 4/16/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}

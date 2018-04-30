package com.example.mcs.aninterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonOne button = new ButtonOne();
        button.setMainActivityOne(this);
    }

    public void onClick(Object viewID) {
        //Handle event
    }
}

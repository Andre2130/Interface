package com.example.mcs.aninterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity implements OnWidgetClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonTwo button = new ButtonTwo();
        button.setOnWidgetClickListener(this);
    }

    public void onClick(Object viewID) {
        //Handle event
    }

    @Override
    public void onClick(int viewID) {

    }
}

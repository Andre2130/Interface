package com.example.mcs.aninterface;

/**
 * Created by MCS on 4/30/2018.
 */

public class ButtonTwo {
   // private MainActivityOne mainActivityOne;
    private OnWidgetClickListener onWidgetClickListener;

    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    public ButtonTwo(){

    }

    //fires when a user clicks button. assum it works
    private void OnClick(){
        onWidgetClickListener.onClick((Integer) getViewID());
    }

    //ID is actually generated at runtime in real life
    public Object getViewID() {
        return 123456;
    }
}

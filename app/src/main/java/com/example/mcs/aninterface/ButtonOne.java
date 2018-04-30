package com.example.mcs.aninterface;

/**
 * Created by MCS on 4/30/2018.
 */

public class ButtonOne {
    private MainActivityOne mainActivityOne;

    public void setMainActivityOne(MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }

    public ButtonOne(){

    }

    //fires when a user clicks button. assum it works
    private void OnClick(){
        mainActivityOne.onClick(getViewID());
    }

    //ID is actually generated at runtime in real life
    public Object getViewID() {
        return 123456;
    }
}

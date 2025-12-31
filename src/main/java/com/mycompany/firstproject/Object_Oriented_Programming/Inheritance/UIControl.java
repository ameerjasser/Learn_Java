package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance;

public class UIControl {
    private boolean isEnabled = true;

    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}

package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance;

public class UIControl {
    public boolean isEnabled = true;

    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
        System.out.println("UIControl initialized");
    }
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

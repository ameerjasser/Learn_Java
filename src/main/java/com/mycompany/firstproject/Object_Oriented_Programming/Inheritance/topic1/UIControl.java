package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class UIControl {
    public boolean isEnabled = true;

    public UIControl() {
        System.out.println("UICotrol");
    }
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UICotrol with boolean");
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

package com.mycompany.firstproject.Object_Oriented_Programming.test;

import com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.TextBox;
import com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.UIControl;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
        new UIControl(true).isEnabled = false;
        System.out.println(box1.toString());
        System.out.println(box1.hashCode()); // this will print a number, which calculated based on the address of this object in the memory
    }
}
        

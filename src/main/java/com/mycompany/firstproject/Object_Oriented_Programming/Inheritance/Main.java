package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance;

public class Main {
    public static void main(String[] args) {
        var box1 = new TextBox();
        System.out.println(box1.toString());
        System.out.println(box1.hashCode()); // this will print a number, which calculated based on the address of this object in the memory
    }
}
        

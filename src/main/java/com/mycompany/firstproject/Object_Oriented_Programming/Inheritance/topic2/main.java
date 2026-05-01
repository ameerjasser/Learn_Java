package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic2;


import com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1.TextBox;

public class Main {
    public static void main(String[] args) {
        var point1 = new point(1,2);
        var point2 = new point(1,2);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject;

import java.awt.*;

/**
 *
 * @author User
 */
public class ReferenceTypes {
    
    public static void main(String[] args){
        
        Point point1 = new Point(1,2);
        Point point2 = point1;
        
        point1.x = 2;
        System.out.println(point2);
    }
}

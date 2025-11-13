/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow.Loops;

/**
 *
 * @author User
 */
public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Banana"};
        
        /*
        for (int i=0; i<fruits.length; i++)
            System.out.println(fruits[i]);
        for (int i =fruits.length - 1; i>=0; i--)
            System.out.println(fruits[i]);
        
        */
        for(String fruit : fruits)
            System.out.println(fruit);

    }
    
}

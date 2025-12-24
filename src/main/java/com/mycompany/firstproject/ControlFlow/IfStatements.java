/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow;


import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        /*
        If temp is greater than 30
            It's a hot day
            Drink plenty of water
        Otherwise, if it's between 20 and 30 
            It's a nice day
        Otherwise
            It's cold
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temp: ");
        float temp = scanner.nextFloat();
        System.out.println(temp);
        
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        
        else if (20 < temp)
            System.out.println("It's a nice day");
        
        else
            System.out.println("It's cold");
        
        scanner.close();
        
        
        
    }
    
}

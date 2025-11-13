/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow;


import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        
        int income;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How much your income: ");
        income = scanner.nextInt();
        
        String className;
        /*
        
        If (income > 100_000)
            className = "First";
        else
            className = "Economy;
        */
        /*
        income = "Economy";
        
        if (income > 100_000);
            className = "First";
        */
        
        className = (income > 100_000)? "First" : "Economy";
        
        System.out.println(className);
    }
    
}

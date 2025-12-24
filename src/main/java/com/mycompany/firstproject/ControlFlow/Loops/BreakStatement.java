/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow.Loops;


import java.util.Scanner;
/**
 *
 * @author User
 */
public class BreakStatement {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        for ( i=0; i<5;){
            System.out.print("Enter a number: ");  
            i = scanner.nextByte();
            System.out.println(i);
            if (i == 5)
                continue;
            System.out.println("hhhhhhhhhh");
            if (i == 0)
                break;
        }    
        scanner.close();
    }
     
    
}

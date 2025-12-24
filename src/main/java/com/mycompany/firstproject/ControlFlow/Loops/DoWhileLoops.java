/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow.Loops;


import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        do{
            System.out.print("Enter what you want: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }while(!input.equals("quit"));

        scanner.close();
    }
    
}

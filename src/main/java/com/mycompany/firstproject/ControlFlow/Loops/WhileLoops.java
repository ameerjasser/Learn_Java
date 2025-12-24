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
public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        /*
        THIS CODE DOES NOT WORK BECAUSE INPUT IS A STRING WHICH IS A REFERENCE TYPE 
        AND WE CANNOT USE COMPARISON OPERATORS BETWEEN REFERENCE TYPES
        BECCAUSE THESE OPERATORS WILL COMPARE THE ADDRESS OR A STRING OBJECTS NOT THEIR VALUE
        
        while (input != "quit"){
            System.out.print("Enter what you want: ");
            input = scanner.nextLine();
            System.out.println(input);
            System.out.println(input != "quit");
        }
        
        ********* THIS CODE DOES NOT WORK BECAUSE INPUT IS A STRING WHICH IS A REFERENCE TYPE 
        AND WE CANNOT USE COMPARISON OPERATORS BETWEEN REFERENCE TYPES
        BECCAUSE THESE OPERATORS WILL COMPARE THE ADDRESS OR A STRING OBJECTS NOT THEIR VALUE
        */
        //System.out.println("hhhhhhhhhhhh" + input.equals("quit"));
        while (!input.equals("quit")){
            System.out.print("Enter what you want: ");
            input = scanner.next().toLowerCase();
            
        }
        scanner.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number =scanner.nextInt();
        
        boolean isDivided5 = (number%5 ==0);
        boolean isDivided3 = (number%3 ==0);
        
        if (isDivided5 && isDivided3)
            System.out.println("FizzBuzz");
        else if (isDivided5)
            System.out.println("Fizz");
        else if (isDivided3)
            System.out.println("Buzz");
        else
            System.out.println(number);
        
    }
    
}

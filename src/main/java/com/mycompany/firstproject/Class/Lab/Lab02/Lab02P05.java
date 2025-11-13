/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Class.Lab.Lab02;

import java.util.Random;
/**
 *
 * @author User
 */
public class Lab02P05 {
    public static void main(String[] args) {
        Random rand = new Random();

       
        int number = rand.nextInt(10001); 

        int originalNumber = number;
        int sum = 0;

        
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;            
            number /= 10;            
        }

      
        System.out.println("Random number: " + originalNumber);
        System.out.println("Sum of digits: " + sum);
    }
}

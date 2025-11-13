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
public class Lab02P03 {
    public static void main(String[] args) {
        Random rand = new Random();

        
        int num1 = rand.nextInt(41) + 10; 
        int num2 = rand.nextInt(41) + 10;
        int num3 = rand.nextInt(41) + 10;

       
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

       
        System.out.println("Random numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Class.Lab.Lab02;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab02P02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the car (P): ");
        double P = input.nextDouble();

        System.out.print("Enter the down payment (D): ");
        double D = input.nextDouble();

        System.out.print("Enter the interest rate in % (R): ");
        double R = input.nextDouble();

        System.out.print("Enter the loan duration in years (Y): ");
        double Y = input.nextDouble();

        
        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);

        
        System.out.printf("Monthly payment: %.2f\n", M);
    }
    
}

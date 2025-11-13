/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Toturial.Lab.Lab02;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab02P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the amount of water in gram: ");
        double massInGrams = scanner.nextDouble();
        
        System.out.print("enter the initial temp in Fahrenheit: ");
        double initialTempF = scanner.nextDouble();
        
        System.out.print("enter the final temp in Fahrenheit: ");
        double finalTempF = scanner.nextDouble();

        double massInKg = massInGrams / 1000.0;

        double initialTempC = (initialTempF - 32.0) * 5.0 / 9.0;
        double finalTempC = (finalTempF - 32.0) * 5.0 / 9.0;

        double deltaT = finalTempC - initialTempC;

        
        double energyNeeded = massInKg * deltaT * 4184;

        System.out.printf("The energy needed is %.6e\n", energyNeeded);
        
    }
}

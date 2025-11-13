/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 *  principal
 * Annual Interest Rate:
 * Period (Years)
 * 
 * Output Mortgage
 */
public class MortgageCalculator {
    public static void main(String[] args) {
        
        //NewFormat percent = new fo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annual = scanner.nextDouble();
        System.out.print("Period (Years):");
        int period = scanner.nextInt();
        
        float n = (period * 12);
        double r = ((annual / 100)/12);
        double power = (Math.pow(1 + r, n));
        double result = (principal * r * power) / (power - 1);
        
        String mortagaeFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println(mortagaeFormatted);
    }
}

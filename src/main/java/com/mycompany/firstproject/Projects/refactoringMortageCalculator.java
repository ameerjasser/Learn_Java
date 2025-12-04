/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects;

import java.util.Scanner;
import java.text.NumberFormat;

public class refactoringMortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal;
        float annual;
        byte period;
        
        while(true){
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal > 1000 && principal < 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        
        while(true){
            
            System.out.print("Annual Interest Rate: ");
            annual = scanner.nextFloat();
            if (annual < 30 && annual >= 0)
                break;
            System.out.println("Enter number greater than 0 and less than or equal to 30.");
        }
        
        while(true){
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }
        
        double finalresult = calculateMortgage(period, annual, principal);
        String mortagaeFormatted = NumberFormat.getCurrencyInstance().format(finalresult);
        System.out.println(mortagaeFormatted);
    }
    public static double calculateMortgage(byte period,
            float annual,
            int principal) {
        short n = (short)(period * 12);
        double r = ((annual / 100)/12);
        double power = (Math.pow(1 + r, n));
        double result = (principal * r * power) / (power - 1);
        
        
        return(result);
        
    }
}

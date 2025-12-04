/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects;

import java.util.Scanner;
import java.text.NumberFormat;

public class refactoringMortageCalculator {
    public static void main(String[] args) {

        int principal = (int)(readNumber("Principal ($1K - $1M): ", 1000, 1000000));
        float annual = (float)(readNumber("Annual Interest Rate: ", 0, 30));
        byte period = (byte)(readNumber("Period (Years): ", 1, 30));
        
        double finalresult = calculateMortgage(period, annual, principal);
        String mortagaeFormatted = NumberFormat.getCurrencyInstance().format(finalresult);
        System.out.println(mortagaeFormatted);
    }
    
    public static double readNumber(String prompt,
            int minimum,
            double maximum){
        Scanner scanner = new Scanner(System.in);
        double input;
        while(true){
            System.out.print(prompt);
            input = scanner.nextDouble();
            if (input >= minimum && input <= maximum)
                break;
            
            System.out.printf("Enter a value between %d and %.0f.\n", minimum, maximum);
        }
        return input;
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

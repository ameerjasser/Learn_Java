/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author User
 */
public class DevelopedMortageCalculator {
    public static void main(String[] args) {
        
        int principal = 0;
        float annual = 0;
        int period;
        boolean isAmount = true;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1000 || principal > 1000000){
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
            }
            isAmount = false;
            
        }while(isAmount);
        
        isAmount = true;
        
        do{
            
            System.out.print("Annual Interest Rate: ");
            annual = scanner.nextFloat();
            if (annual > 30 || annual <= 0){
                System.out.println("Enter number greater than 0 and less than or equal to 30.");
                continue;
            }
            isAmount = false;
            //System.out.println(annual);
        
        }while(isAmount);
        
        isAmount = true;
        do{
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (period <1 || period >30){
                System.out.println("Enter a value between 1 and 30.");
                continue;
            }
            isAmount = false;
                
        }while(isAmount);
        
        float n = (period * 12);
        double r = ((annual / 100)/12);
        double power = (Math.pow(1 + r, n));
        double result = (principal * r * power) / (power - 1);
        
        String mortagaeFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println(mortagaeFormatted);
        
        
    }
}

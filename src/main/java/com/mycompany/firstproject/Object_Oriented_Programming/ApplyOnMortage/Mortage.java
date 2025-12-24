package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

import java.text.NumberFormat;


public class Mortage {
    static String myName = "Amir";
    public static void main(String[] args) {

        int principal = (int)(Console.readNumber("Principal ($1K - $1M): ", 1000, 1000000));
        float annual = (float)(Console.readNumber("Annual Interest Rate: ", 0, 30));
        byte period = (byte)(Console.readNumber("Period (Years): ", 1, 30));
        
        printPaymentSchedule(period, annual, principal);
    }

    private static void printPaymentSchedule(byte period, float annual, int principal) {
        double finalresult = calculateMortgage(period, annual, principal);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(finalresult);
        System.out.println(mortgageFormatted);
        System.out.printf("MORTGAGE \n------- \nMonthly Payments: %s\n\nPAYMENT SCHEDULE \n--------------",mortgageFormatted);
        
        for(short month= 1; month <= period * 12; month++){
            double balance = calculateBalance(period, principal, annual, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            
        }
    }
    
    public static double calculateBalance(byte period,
            int principal,
            float annual,
            short numberOfPaymentMade) {
        short numberOfPayment = (short)(period * 12);
        double monthlyInterest = ((annual / 100)/12);
        
        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayment) 
                - Math.pow(1+monthlyInterest,numberOfPaymentMade))
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1);
        return balance;
    }
    
    public static double calculateMortgage(byte period,
            float annual,
            int principal) {
        short numberOfPayment = (short)(period * 12);
        double monthlyInterest = ((annual / 100)/12);
        double power = (Math.pow(1 + monthlyInterest, numberOfPayment));
        double result = (principal * monthlyInterest * power) / (power - 1);
        
        
        return(result);
        
    }
}

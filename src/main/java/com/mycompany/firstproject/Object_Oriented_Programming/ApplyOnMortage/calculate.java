package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;
/* 
import java.text.NumberFormat;
import java.util.Scanner;

public class calculate(static byte period,static float annual,static int principal) {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
  //  private static byte period;
  //  private static float annual;
  //  private static int principal; 
    public static void printPaymentSchedule() {
        double finalresult = calculateMortgage(period, annual, principal);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(finalresult);
        System.out.println(mortgageFormatted);
        System.out.printf("MORTGAGE \n------- \nMonthly Payments: %s\n\nPAYMENT SCHEDULE \n--------------",mortgageFormatted);
        
        for(short month= 1; month <= period * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(period, principal, annual, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            
        }
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
    
    private static double calculateBalance(short numberOfPaymentMade) {
        short numberOfPayment = (short)(period * MONTHS_IN_YEAR);
        double monthlyInterest = ((annual / PERCENT)/MONTHS_IN_YEAR);
        
        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayment) 
                - Math.pow(1+monthlyInterest,numberOfPaymentMade))
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1);
        return balance;
    }
    
    private static double calculateMortgage() {
        short numberOfPayment = (short)(period * MONTHS_IN_YEAR);
        double monthlyInterest = ((annual / PERCENT)/MONTHS_IN_YEAR);
        double power = (Math.pow(1 + monthlyInterest, numberOfPayment));
        double result = (principal * monthlyInterest * power) / (power - 1);
        
        
        return(result);
        
    }
}


*/

package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

import java.text.NumberFormat;

public class MortageReport {
    private final byte MONTHS_IN_YEAR = 12;
    private MortageCalculate calculate;
    
    public MortageReport(MortageCalculate calculate) {
        this.calculate = calculate;
    }

    public void printMortage(){
        double finalresult = calculate.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(finalresult);
        System.out.println("MORTGAGE \n------- \nMonthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule(){
        
        System.out.print("Monthly Payments: \n\nPAYMENT SCHEDULE ");
        
        for(short month= 1; month <= calculate.getPeriod() * MONTHS_IN_YEAR; month++){
            double balance = calculate.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
            
        }
    }
}


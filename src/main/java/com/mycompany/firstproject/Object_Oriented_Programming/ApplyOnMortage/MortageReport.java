package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

import java.text.NumberFormat;

public class MortageReport {
    private MortageCalculate calculate;
    private NumberFormat currency;
    
    public MortageReport(MortageCalculate calculate) {
        this.calculate = calculate;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortage(){
        double finalresult = calculate.calculateMortgage();
        String mortgageFormatted = currency.format(finalresult);
        System.out.printf("MORTGAGE \n------- \nMonthly Payments: %s\n\n", mortgageFormatted);
    }

    public void printPaymentSchedule(){
        System.out.print("PAYMENT SCHEDULE ");
        calculate.getRemainingBalances();
        for(double balance : calculate.getRemainingBalances())
            System.out.printf("%s\n", currency.format(balance));
    }
}


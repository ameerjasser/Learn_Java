package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

public class MortageCalculate {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private byte period;
    private int principal;
    private float annualInterest;
    public MortageCalculate(byte period, int principal, float annualInterest) {
        this.period = period;
        this.principal = principal;
        this.annualInterest = annualInterest;
    }
    public double calculateBalance(short numberOfPaymentMade) {
        
        short numberOfPayment = (short)(period * MONTHS_IN_YEAR);
        double monthlyInterest = ((annualInterest / PERCENT)/MONTHS_IN_YEAR);
        
        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayment) 
                - Math.pow(1+monthlyInterest,numberOfPaymentMade))
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1);
        return balance;  
    }

    public double calculateMortgage() {
        short numberOfPayment = (short)(period * MONTHS_IN_YEAR);
        double monthlyInterest = ((annualInterest / PERCENT)/MONTHS_IN_YEAR);
        double power = (Math.pow(1 + monthlyInterest, numberOfPayment));
        double result = (principal * monthlyInterest * power) / (power - 1);

        return(result);
        
    }
    public short getPeriod() {
        return period;
    }
    
}

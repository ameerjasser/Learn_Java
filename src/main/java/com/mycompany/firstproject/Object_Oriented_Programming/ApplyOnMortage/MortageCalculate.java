package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

public class MortageCalculate {

    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;
    private byte period;
    private int principal;
    private float annualInterest;
    public MortageCalculate(byte period, int principal, float annualInterest) {
        this.period = period;
        this.principal = principal;
        this.annualInterest = annualInterest;
    }
    public double calculateBalance(short numberOfPaymentMade) {
        
        short numberOfPayment = getNumberOfPayment();
        double monthlyInterest = getMonthlyInterest();
        double balance = principal
                *(Math.pow(1+monthlyInterest,numberOfPayment) 
                - Math.pow(1+monthlyInterest,numberOfPaymentMade))
                /(Math.pow(1+monthlyInterest,numberOfPayment)-1);
        return balance;  
    }

    public double calculateMortgage() {
        short numberOfPayment = getNumberOfPayment();
        double monthlyInterest = getMonthlyInterest();
        double power = (Math.pow(1 + monthlyInterest, numberOfPayment));
        double result = (principal * monthlyInterest * power) / (power - 1);
        return(result);  
    }
    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayment()];
        for(short month= 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    } 
    private short getNumberOfPayment() {
        return (short)(period * MONTHS_IN_YEAR);
    }
    private float getMonthlyInterest() {
        return (annualInterest / PERCENT)/MONTHS_IN_YEAR;
    }
}

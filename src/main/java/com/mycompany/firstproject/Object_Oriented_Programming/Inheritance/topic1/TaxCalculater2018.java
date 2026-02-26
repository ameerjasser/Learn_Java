package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class TaxCalculater2018 implements TaxCalculater {
    private double taxableIncome;

    public TaxCalculater2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}

package com.mycompany.firstproject.Object_Oriented_Programming.Interface;

public class TaxReport {

    private TaxCalculater calculater;

    public TaxReport(TaxCalculater calculater) {
        this.calculater = calculater;
    }

    public void show(){
        double tax = calculater.calculateTax();
        System.out.println("Tax: " + tax);
    }
    public void setCalculater(TaxCalculater calculater) {
        this.calculater = calculater;
    }
}

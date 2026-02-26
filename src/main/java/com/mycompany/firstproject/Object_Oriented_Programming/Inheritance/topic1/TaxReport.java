package com.mycompany.firstproject.Object_Oriented_Programming.Inheritance.topic1;

public class TaxReport {
    private TaxCalculater calculater;

    public TaxReport(TaxCalculater calculater) {
        this.calculater = calculater;
    }

    public void show(){
        double tax = calculater.calculateTax();
        System.out.println("Tax: " + tax);
    }
}

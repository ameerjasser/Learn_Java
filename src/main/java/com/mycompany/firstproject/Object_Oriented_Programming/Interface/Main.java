package com.mycompany.firstproject.Object_Oriented_Programming.Interface;

public class Main {
    public static void main(String[] args) {
        var calculater = new TaxCalculater2018(100_000);
        var taxReport = new TaxReport();
        taxReport.show(calculater);
        taxReport.show(new TaxCalculater2019());
    }
}

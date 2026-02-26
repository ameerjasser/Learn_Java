package com.mycompany.firstproject.Object_Oriented_Programming.Interface;

public class Main {
    public static void main(String[] args) {
        var calculater = new TaxCalculater2018(100_000);
        var taxReport = new TaxReport(calculater);
        taxReport.show();

        taxReport.setCalculater(new TaxCalculater2019());
        taxReport.show();
    }
}

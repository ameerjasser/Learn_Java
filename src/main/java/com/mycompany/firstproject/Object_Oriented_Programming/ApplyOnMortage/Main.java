package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

public class Main {
    static String myName = "Amir";
    public static void main(String[] args) {

        int principal = (int)(Console.readNumber("Principal ($1K - $1M): "));
        float annualInterest = (float)(Console.readNumber("Annual Interest Rate: ", 0, 30));
        byte period = (byte)(Console.readNumber("Period (Years): ", 1, 30));

        MortageCalculate calculate = new MortageCalculate(period, principal, annualInterest);
        MortageReport report = new MortageReport(calculate);
        report.printMortage();
        report.printPaymentSchedule();
    }   
}

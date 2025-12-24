/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Lab.Lab03;

import java.util.Scanner;
//import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class Lab03P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales volume: ");
        double sales = scanner.nextDouble();
        double commission;

        
        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }

        System.out.printf("%.2f\n", commission);
        //DecimalFormat df = new DecimalFormat("0.00");
        //System.out.println("Commission: $" + df.format(commission));
        scanner.close();
    }
}

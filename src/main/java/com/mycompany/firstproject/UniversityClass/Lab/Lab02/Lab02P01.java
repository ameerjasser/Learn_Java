/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Lab.Lab02;


import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab02P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the temperature in degree Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();
        //float celsius = (float)((fahrenheit-32)/1.8);
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("the degree Celsius is: %.2f", celsius);
        scanner.close();
                
    }
    
}

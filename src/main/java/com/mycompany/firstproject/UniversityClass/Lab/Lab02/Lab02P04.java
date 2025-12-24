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
public class Lab02P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        
        System.out.println(totalSeconds + " seconds is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
        scanner.close();
    }
}

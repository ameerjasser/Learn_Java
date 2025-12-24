/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Lab.Lab03;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lab03P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the x-coordinate of the point: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the point: ");
        double y = scanner.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= radius) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
        scanner.close();
    }
}

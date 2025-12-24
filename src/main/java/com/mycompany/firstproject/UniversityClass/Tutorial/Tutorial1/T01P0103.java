/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Tutorial.Tutorial1;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class T01P0103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Marks o you want to enter: ");
        int x = scanner.nextInt();
        int result = 0;
        for(int i = 0; i<x ; i++){
            System.out.print("enter a mark: ");
            result += scanner.nextInt();
        }
        
        if(result>=40)
            System.out.println("pass");
        else
            System.out.println("fail");
        
        scanner.close();
    }
    
}

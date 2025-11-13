/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Toturial.Tutorial.Tutorial04;

import java.util.*;
/**
 *
 * @author User
 */
public class tst {
    public static void main(String[] args) {
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("First N prime number (N): ");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++){
            int randomPick = random.nextInt(primeNumber.length);
            System.out.println(primeNumber[randomPick]);
        }
    }
    
}

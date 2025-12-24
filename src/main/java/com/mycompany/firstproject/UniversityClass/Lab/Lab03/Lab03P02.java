/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Lab.Lab03;

import java.util.Random;
/**
 *
 * @author User
 */
public class Lab03P02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(6);
        String word;
        switch (x) {
            case 0: word = "Zero"; break;
            case 1: word = "One"; break;
            case 2: word = "Two"; break;
            case 3: word = "Three"; break;
            case 4: word = "Four"; break;
            case 5: word = "Five"; break;
            default: word = "Unknown"; // Just in casee
        }
        
        System.out.println(x + " is " +word);
    }
    
}

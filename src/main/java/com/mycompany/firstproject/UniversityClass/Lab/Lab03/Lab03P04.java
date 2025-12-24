/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.UniversityClass.Lab.Lab03;

import java.util.Random;


public class Lab03P04 {
    public static void main(String[] args) {
        Random rand = new Random();

        int player1Roll1 = rand.nextInt(6) + 1; 
        int player1Roll2 = rand.nextInt(6) + 1;
        int player1Total = player1Roll1 + player1Roll2;

        int player2Roll1 = rand.nextInt(6) + 1;
        int player2Roll2 = rand.nextInt(6) + 1;
        int player2Total = player2Roll1 + player2Roll2;

        System.out.println("Player 1 rolled: " + player1Roll1 + " and " + player1Roll2 + " | Total: " + player1Total);
        System.out.println("Player 2 rolled: " + player2Roll1 + " and " + player2Roll2 + " | Total: " + player2Total);

        if (player1Total > player2Total) {
            System.out.println("Player 1 wins!");
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
    
}

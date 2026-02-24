/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Tst0;

//import java.math.*;
/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class T01 {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);


        sc.close();
        int x = 10;
        int[] arr2 = {1, 2, 3};

        modify(x, arr2);

        System.out.println("x: " + x);           // Output: 10 (Did not change!)
        System.out.println("arr: " + Arrays.toString(arr2)); // Output: [99, 2, 3] (Changed!)
    }

    public static void modify(int num, int[] array) {
        num = 50;           // Changes only the local copy
        array[0] = 99;      // Changes the actual data at that memory address
        System.exit(0);
    }



}

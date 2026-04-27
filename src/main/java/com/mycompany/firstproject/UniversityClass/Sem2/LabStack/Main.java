package com.mycompany.firstproject.UniversityClass.Sem2.LabStack;

import java.util.Stack;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// TODO: import java.util.Deque;

import java.util.Deque;  

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.print("Enter : ");


    

    }
    private static String isOperation() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.asList(scanner.nextLine().split(" "));
        if ( input.contains("*") || input.contains("/")) {             /// input.contains("+") || input.contains("-")
            
            
            return input.get(0);
        } else {
            System.out.println(input.toString());
        }
        return null;
    }
}

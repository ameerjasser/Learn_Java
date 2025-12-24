package com.mycompany.firstproject.Object_Oriented_Programming.ApplyOnMortage;

import java.util.Scanner;

public class Console {

    public static double readNumber(String prompt,
            int minimum,
            double maximum){
        Scanner scanner = new Scanner(System.in);
        double input;
        while(true){
            System.out.print(prompt);
            input = scanner.nextDouble();
            if (input >= minimum && input <= maximum)
                break;
            
            System.out.printf("Enter a value between %d and %.0f.\n", minimum, maximum);
        }
        scanner.close();
        return input;
        
    }

}

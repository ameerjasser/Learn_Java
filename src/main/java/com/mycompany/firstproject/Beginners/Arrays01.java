package com.mycompany.firstproject.Beginners;

import java.util.Arrays;

public class Arrays01 {
    
    public static void main(String[] args) {
        int[] numbers = {1,3,5,2,6};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
   
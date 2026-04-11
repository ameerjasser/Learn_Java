package com.mycompany.firstproject.UniversityClass.Sem2.Individual1;

public class AutoboxingSlowdown {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Notice the capital 'L' - This is the Wrapper Object!
        int sum = 0;


        for (long i = 0; i < 198_300_0000_00L; i++) {
            sum += i;  // THE HIDDEN DISASTER IS HERE
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
        System.out.println(sum);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}

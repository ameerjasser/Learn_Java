package com.mycompany.firstproject.UniversityClass.Lab.Lab08.Q01;

import java.util.Arrays;
import java.util.Random;

public class Number {

    public Number() {
        this(10,100);
    }
    public Number(int numRandom) {
        this(numRandom,100);
    }
    public Number(int numRandom, int numRange){
        Random random = new Random();
        int[] randomArray = new int[numRandom];
        for (int i = 0; i < numRandom; i++) {
            randomArray[i] = random.nextInt(numRange) + 1;
        }
        System.out.println("Random array: " + Arrays.toString(randomArray));

        int sum =0;
        int max =-1;
        int min =0;
        int[] squareArray = new int[randomArray.length];
        int[] intArray = new int[randomArray.length];
        int[] evenNum = new int[randomArray.length];

        System.out.println("The items of the array are: ");
        System.out.println(Arrays.toString(randomArray));

        for (int j=0; j<intArray.length; j++){
            int num = intArray[j];
            for (int k=2; k<num; k++){
                if (num % k == 0){
                    System.out.printf("The prime number is: %d\n", num);
                    break;
                }   
            }
        }
        for (int i =0; i<randomArray.length; i++){
            int num = randomArray[i];
            intArray[i] = num;
            sum = sum + num;
            squareArray[i] = num * num;
            if (i == 0 || num > max)
                max = num;
            if (i == 0 || num < min)
                min = num;
            if (num % 2 ==0){
                evenNum[i] = num;
            }
            if (num % 2 ==0){
                if (i == 0){
                    System.out.print("The even numbers are: ");
                }
                if(i == evenNum.length -1){
                    System.out.print(num + "\n");
                } else {
                System.out.print(num + ", ");
                }
            }
        }
        System.out.printf("The max number is: %d\n", max);
        System.out.printf("The min number is: %d\n", min);
        System.out.printf("The average is: %.2f\n", (float)sum / intArray.length);
        System.out.println("The square of the array is: " + Arrays.toString(squareArray));
        
    }
}
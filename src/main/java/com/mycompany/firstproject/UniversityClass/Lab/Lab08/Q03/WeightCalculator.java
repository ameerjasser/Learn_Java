package com.mycompany.firstproject.UniversityClass.Lab.Lab08.Q03;

public class WeightCalculator {
    public WeightCalculator(int age, float height) {
        double weight = (height - 100 + age / 10) * 0.9;
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " cm");
        System.out.printf("The weight is: %.2f kg\n", weight);
    }
}

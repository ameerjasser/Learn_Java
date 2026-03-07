package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        var topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println(stack);
        var poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println(stack);



    }
}

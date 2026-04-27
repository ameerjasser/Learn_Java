package com.mycompany.firstproject.DataStractures.Stacks.BuildStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push1(50);
        stack.push1(40);
        stack.push1(20);
        stack.push2(40);
        stack.push2(30);
        stack.push2(20);
        System.out.println(stack.printStack1());
        System.out.println(stack.pop1(1));
        System.out.println(stack.printStack1());
        System.out.println(stack.min1());
    }
}

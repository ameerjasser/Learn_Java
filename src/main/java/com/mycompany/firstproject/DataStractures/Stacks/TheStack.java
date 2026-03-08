package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class TheStack {
    public Stack<Character> toStack(String input) {
        if(input == null) throw new IllegalArgumentException("The input cannot be null.");
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        return stack;
    }

}

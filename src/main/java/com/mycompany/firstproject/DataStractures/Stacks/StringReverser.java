package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if(input == null)
            throw new NoSuchElementException();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
            stack.push(c);
        StringBuilder reversedString = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            reversedString.append(stack.pop()+" ");
        }
        return reversedString.toString();
    }
}

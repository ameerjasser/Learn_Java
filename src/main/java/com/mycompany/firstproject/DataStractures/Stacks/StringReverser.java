package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StringReverser extends TheStack {
    public String reverse(String input) {
        var stack = toStack(input);
        StringBuilder reversedString = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            reversedString.append(stack.pop()+" ");
        }
        return reversedString.toString();
    }
}

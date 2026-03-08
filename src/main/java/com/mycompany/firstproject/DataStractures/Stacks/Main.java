package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        StringReverser stringR = new StringReverser();
        Stack<Character> stack = new Stack<>();
        Stack<Character> reverseStack = new Stack<>();
        String string = "ABCDEFGH";

        // FIRST WAY
//        for(int i=string.length()-1; i>=0; i--){
//            stack.push(string.charAt(i));
//            //System.out.print(string.charAt(i)+" ");
//        }

        // SECOND WAY
//        System.out.println(stack);
//        for(int i=0; i<string.length(); i++){
//            //reverseStack.push(stack.pop());
//            System.out.print(stack.pop()+" ");
//        }

        // THIRD WAY
        String reversedString = stringR.reverse(string);
        System.out.println("\n"+reversedString);
    }
}

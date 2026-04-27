package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;
import java.util.List;

public class BalancedExpressions {
    private final List<Character> rightBrackets = java.util.Arrays.asList(')', '}', ']');
    private final List<Character> leftBrackets = java.util.Arrays.asList('(', '{', '[');
    public boolean isBalanced(String input)  {
        if(input == null) throw new IllegalArgumentException("Input cannot be NULL!!!");
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){

            if(isLeftBracket(ch))
                stack.push(ch);
            else if(isRightBracket(ch)) {
                if(stack.empty()) return false;

                char x = stack.pop();
                if(!isMatchingPair(ch, x)) return true;

                // if(x == '(')
                //     x=')';
                // else if(x=='{')
                //     x = '}';
                // else if(x=='[')
                //     x=']';

                // if(ch == x)
                //     stack.pop();
                // else {
                //     return false;
                // }
                
            }
        }
        return stack.empty();
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
        //return ch == ')' || ch == '}' || ch == ']';
    }
    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }
    private boolean isMatchingPair(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
        // return (left == '(' && right == ')') ||
        //         (left == '{' && right == '}') ||
        //         (left == '[' && right == ']');
    }

}

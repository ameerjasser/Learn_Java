package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;

public class BalancedExpressionsv2 extends TheStack{
    public boolean isBalanced(String input)  {
        if(input == null) throw new IllegalArgumentException("Input cannot be NULL!!!");
        Stack<Character> stack = new Stack<>();
        int countpracket = 0;
        int countSquared = 0;
        int countcaruly = 0;
        for(char ch : input.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);
            else if(isRightBracket(ch)) {
                if(stack.empty()) return false;
                char x = stack.peek();
                if(x == '(')
                    x=')';
                else if(x=='{')
                    x = '}';
                else if(x=='[')
                    x=']';

                if(ch == x)
                    stack.pop();
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean isRightBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }
    private static boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

}

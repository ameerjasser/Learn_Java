package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;

public class BalancedExpressions extends TheStack{
    public boolean isBalanced(String input)  {
        if(input == null) throw new IllegalArgumentException("Input cannot be NULL");
        Stack<Character> stack = new Stack<>();
        int countpracket = 0;
        int countSquared = 0;
        int countcaruly = 0;
        //System.out.println("fjkfdjk");
        for(char ch : input.toCharArray()){
//            if(current ==')')
//                countpracket++;
//            else if(current == ']')
//                countSquared++;
//            else if(current == '}')
//                countcaruly++;
//            else if(current == '(')
//                countpracket--;
//            else if(current == '[')
//                countSquared--;
//            else if(current == '{')
//                countcaruly--;
//
//            if(countpracket<0 || countSquared<0 || countcaruly<0)
//                return false;
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
//                    System.out.println(stack);
//                    System.out.println("eleeesssss");
//                    System.out.printf("f: %s, S: &c\n", stack.peek(), ch);
//                    System.out.println(ch);
                    return false;
                }
            }
        }
//        if(countpracket ==0 && countcaruly==0 && countSquared==0)
//            return true;
//        System.out.println(stack);
//        System.out.println("feom");
        return stack.empty();
    }

    private static boolean isRightBracket(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }
    private static boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

}

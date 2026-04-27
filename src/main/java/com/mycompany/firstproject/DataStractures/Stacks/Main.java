package com.mycompany.firstproject.DataStractures.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BalancedExpressions Ba = new BalancedExpressions();
        String string = null;
        //System.out.println(Ba.toStack(string));
        System.out.println(Ba.isBalanced("{{{[[]]}}}"));
        //System.out.println("Hello ");
    }
}

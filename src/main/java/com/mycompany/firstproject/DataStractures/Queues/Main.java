package com.mycompany.firstproject.DataStractures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        queue.add(10);
        queue.add(20);
        //queue.size();

        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }
    public static void reverse(Queue<Integer> queue1){
        if(queue1.isEmpty()) throw new IllegalArgumentException();

        int size = queue1.size();
        Stack<Integer> stack = new Stack<>();
        //int[] x = new int[size];
        for(int i=0; i<size; i++){
        //    x[i] = queue.remove();
            stack.add(queue1.remove());
        }
         for(int i=size-1; i>=0; i--){
        //     queue.add(x[i]);
            queue1.add(stack.pop());
         }
        //System.out.println(Arrays.toString(x));
        //System.out.println(queue);
    }
}

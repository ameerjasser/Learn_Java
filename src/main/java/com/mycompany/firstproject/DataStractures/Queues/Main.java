package com.mycompany.firstproject.DataStractures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        queue.add(5);

        System.out.println(queue);
    }
}

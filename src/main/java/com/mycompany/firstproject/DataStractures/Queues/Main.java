package com.mycompany.firstproject.DataStractures.Queues;


public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue);
        queue.reverseFirstKItem(3);
        System.out.println(queue);
    }
}

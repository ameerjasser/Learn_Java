package com.mycompany.firstproject.DataStractures.Queues;


public class Main {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println();
        queue.enqueue(40);
        System.out.println(queue);
    }
}

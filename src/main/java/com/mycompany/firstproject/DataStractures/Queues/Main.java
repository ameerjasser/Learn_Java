package com.mycompany.firstproject.DataStractures.Queues;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(6);

        queue.enqueue(20);
        queue.enqueue(15);
        queue.enqueue(10);
        System.out.println(queue);
        queue.dequeue();
        queue.enqueue(5);
        queue.enqueue(66);
        System.out.println(queue);
        System.out.println(queue.dequeue());

    }
}

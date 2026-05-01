package com.mycompany.firstproject.DataStractures.Queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int first = 0;
    private int last = 0;
    private int count =0;

    public ArrayQueue(int capacity) {
        array = new int[capacity];
    }
    public void enqueue(int item){
        if(isFull()) throw new IllegalArgumentException("It's full!!!");

        array[last] = item;
        last = (last +1) % array.length;
        count++;
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalArgumentException("It's empty!!!");
        var item = array[first];
        array[first] =0;
        first = (first +1) % array.length;
        count--;
        return item;
    }
    public int peek(){
        return array[first];
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
        //return Arrays.toString(Arrays.copyOfRange(array, first, last));
    }
    private boolean isEmpty() {
        return count==0;
    }
    private boolean isFull() {
        return count == array.length;
    }

}

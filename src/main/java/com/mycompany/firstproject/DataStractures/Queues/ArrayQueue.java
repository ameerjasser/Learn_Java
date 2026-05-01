package com.mycompany.firstproject.DataStractures.Queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array = new int[4];
    private int first = 0;
    private int last = 0;

    public void enqueue(int item){
        if(isFull()) throw new IllegalArgumentException();

        //first == 0
        for(int i=last; i>=0; i++){
            array[i+1] = array[i];
        }
        array[0] = item;
        last++;
    }

    public String printQueue(){
        return Arrays.toString(array);
    }
    private boolean isFull() {
        return last == array.length;
    }

}

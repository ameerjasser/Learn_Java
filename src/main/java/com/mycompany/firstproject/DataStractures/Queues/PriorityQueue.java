package com.mycompany.firstproject.DataStractures.Queues;

import java.util.Arrays;
import java.util.Stack;

public class PriorityQueue {
    private int[] queue;
    private int count =0;
    public PriorityQueue(int capacity){
        queue = new int[capacity];
    }
    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException("It's full!!!");
        
        shiftItemsToInsert(item);
        count++;
    }
    public void printQueue(){
        System.out.println(queue);
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int remove(){
        if(isEmpty()) throw new IllegalStateException();
        return queue[--count];
    }
    private void shiftItemsToInsert(int item) {
        int i=0;
        if(count ==0){
            queue[i] = item;
            return;
        }else{
            for(i =count-1; i>=0; i--){
                if(queue[i]>item){
                    queue[i+1] = queue[i];

                }else{ 
                    break; 
                }
            }
            queue[i+1] = item;
        }
    }
    public void reverseFirstKItem(int k){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            stack.push(remove());
        }
        System.out.println(stack);
        System.out.println();
        count = count + k;
        System.out.println(count);
        for(int j=count-1; j>0; j--){
            if(!stack.isEmpty())
                queue[j] = stack.pop();
        }
    }
    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(queue, 0, count));
    }
    private boolean isFull() {
        return count== queue.length;
    }
}

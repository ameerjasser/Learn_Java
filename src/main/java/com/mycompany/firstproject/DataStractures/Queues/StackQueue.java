package com.mycompany.firstproject.DataStractures.Queues;

import java.util.Stack;

public class StackQueue {
    private boolean inQueueOrder = false; 
    private Stack<Integer> stack = new Stack<>();
    
    
    public void enqueue(int item){
        if(isInQueueOrder()) changeOrder();  // we are puttung in a stack( we don't want to add items in different orders 
        stack.push(item);
    }
    public int dequeue(){
        if(stack.isEmpty()) throw new IllegalStateException("It's empty!!!");
        if(!isInQueueOrder()) changeOrder();
        return stack.pop();
    }
    public int peek(){
        if(stack.isEmpty()) throw new IllegalStateException("It's empty!!!");
        if(!isInQueueOrder()) changeOrder();
        return stack.peek(); 
    }
    private void changeOrder() {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        stack = temp;
        inQueueOrder = !inQueueOrder;
    }
    public boolean isInQueueOrder() {
        return inQueueOrder;
    }
    
    @Override
    public String toString(){
        if(isInQueueOrder()) changeOrder();
        return stack.toString();
    }


}

package com.mycompany.firstproject.DataStractures.Stacks.BuildStack;

import java.util.Arrays;
public class MyStack {
    private int size=3;
    private int[] arr = new int[size];
    private int count1 = 0;
    private int count2 = -1;
    private int[] arr2;
    private static final double GROWTH_FACTOR = 1.5;
    public MyStack() {
        System.out.println("Stack created!");
    }
    public void push1(int item){
        if(getNumberOfElements() >= size){
            increaseSize();
        }
        arr[count1++] = item;
    }

    public void push2(int item){
        if(getNumberOfElements() >= size){
            increaseSize();
        }
        arr[arr.length + count2--] = item;
    }

    public int pop1(){
        return pop1(1);
    }
    public int pop1(int times){
        if(isEmpty1() || times<=0 || times>count1){
            throw new RuntimeException("Stack does not have this number of Elements!");
        }
        
        int x =arr[count1-1];
        for(int i=0; i<times; i++){
            x = arr[count1-1];
            arr[count1--] =0;
        }
        return x;
    }
    public int pop2(int times){
        if(isEmpty2() || -count2 <= times || times<=0){
            throw new RuntimeException("Stack does not have this number of elements!!");
        }

        int index = arr.length + count2;
        int x =arr[index];
        for(int i=0; i<times; i++){
            x = arr[arr.length + ++count2];
            arr[arr.length + count2] =0;
        }
        return x;
    }

    public int peek(){
        if(isEmpty1()){
            throw new RuntimeException("Stack is empty!");
        }
        return arr[count1 -1];
    }
    public int min1(){
        if(isEmpty1()){
            throw new RuntimeException("Stack is empty!");
        }
        int min = arr[0];
        for(int i=1; i<count1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public int min2(){
        if(isEmpty2()){
            throw new RuntimeException("Stack is empty!");
        }
        int min = arr[arr.length + count2 +1];
        for(int i=arr.length +count2 +1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public String printStack1(){
        int[] stackElements = Arrays.copyOfRange(arr, 0, count1);   // amazing!!!
        return Arrays.toString(stackElements);
    }
    public String printStack2(){
        int[] stackElements = Arrays.copyOfRange(arr, size + count2 +1, size);  // size - -count2 = +  
        for(int i=0; i<stackElements.length/2; i++){
            int temp = stackElements[i];
            stackElements[i] = stackElements[stackElements.length -1 -i];
            stackElements[stackElements.length -1 -i] = temp;
        }
        return Arrays.toString(stackElements);
    }
    private void increaseSize() {
        size = (int) (size * GROWTH_FACTOR);
        arr2 = new int[size];
        for(int i=0; i<count1; i++){
            arr2[i] = arr[i];
        }
        for(int i=0; i<-count2-1; i++){
            arr2[arr2.length-1-i] = arr[arr.length-1-i];
        }
        arr = arr2;
    }
    public boolean isEmpty1(){
        return count1 == 0;
    }
    public boolean isEmpty2(){
        return count2 == -1;
    }
    private int getNumberOfElements(){
        return count1 + (-count2 -1);
    }

}

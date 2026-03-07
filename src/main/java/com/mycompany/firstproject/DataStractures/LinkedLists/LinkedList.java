package com.mycompany.firstproject.DataStractures.LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            count++;
        }
    }

    private Node first;
    private Node last;
    private int count = 0;
    //add first
    //add last
    //delete first
    //delete last
    //contains
    // indexOf
    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
    }
    public void deleteFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        count--;
    }
    public void deleteLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
        else{
            var previous = getPrevious(last);
            previous.next = null;
            last = previous;
        }
        count--;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public int indexOf(int item){
        var current = first;
        for(int i=0; i<count; i++){
            if(current.value == item)
                return i;
            current = current.next;
        }
        return -1;
    }
    private boolean isEmpty(){
        return first == null;
    }
    private Node getPrevious(Node node) {
        var current = first;
        while(current.next != null) {
            if (current.next != node) {
                current = current.next;
            } else break;
        }
        return current;
    }
    public int size(){ return count; }
    public int[] toArray(){
        int[] array = new int[count];
        var current = first;
        for(int i=0; i<count; i++){
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }
    public void reverse(){
        if(isEmpty()) return;
        var current = last;
        var newFirst = first;
        for(int i=0; i<count; i++){
            if(i==0){
                current.next = getPrevious(current);
                newFirst = current;
                current = current.next;
            }else if(i >= count-1){
                current.next = null;
                last = current;
                break;
            }else {
                current.next = getPrevious(current);
                current = current.next;
            }
        }
        first = newFirst;
    }
    // /////////////// another way to reverse
    //    public void reverse(){
//        if(isEmpty()) return;
//        var previous = first;
//        var current = first.next;
//        while(current != null){
//            var next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        last = first;
//        last.next = null;
//        first = previous;
//    }
    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();

        if(k == 0) return last.value;
        else if(k<0) throw new IllegalStateException();
        var num1 = first;
        var num2 = first;
        int i = 0;
        do{
            num2 = num2.next;
            if(num2 == null)
                throw new IllegalArgumentException();
            i++;
        }while(i<=k-1);
        while(num2 != last){
            num1 = num1.next;
            num2 = num2.next;
        }
        return num1.value;
    }
}

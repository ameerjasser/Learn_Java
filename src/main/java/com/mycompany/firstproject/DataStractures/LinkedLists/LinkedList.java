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

    private Node head;
    private Node till;
    private int count = 0;
    //add first
    //add last
    //delete first
    //delete last
    //contains
    // indexOf

    // TODO void add(int item){ addLast(item); }

    public void addLast(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = till = node;
        else{
            till.next = node;
            till = node;
        }
    }
    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            head = till = node;
        else{
            node.next = head;
            head = node;
        }
    }
    public void deleteFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(head == till)
            head = till = null;
        else{
            var second = head.next;
            head.next = null;
            head = second;
        }
        count--;
    }
    public void deleteLast() {
        if(isEmpty())
            throw new NoSuchElementException();
        if(head == till)
            head = till = null;
        else{
            var previous = getPrevious(till);
            previous.next = null;
            till = previous;
        }
        count--;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public int indexOf(int item){
        var current = head;
        for(int i=0; i<count; i++){
            if(current.value == item)
                return i;
            current = current.next;
        }
        return -1;
    }
    private boolean isEmpty(){
        return head == null;
    }
    private Node getPrevious(Node node) {
        var current = head;
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
        var current = head;
        for(int i=0; i<count; i++){
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }
    public void reverse(){
        if(isEmpty()) return;
        var current = till;
        var newFirst = head;
        for(int i=0; i<count; i++){
            if(i==0){
                current.next = getPrevious(current);
                newFirst = current;
                current = current.next;
            }else if(i >= count-1){
                current.next = null;
                till = current;
                break;
            }else {
                current.next = getPrevious(current);
                current = current.next;
            }
        }
        head = newFirst;
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

        if(k == 0) return till.value;
        else if(k<0) throw new IllegalStateException();
        var num1 = head;
        var num2 = head;
        int i = 0;
        do{
            num2 = num2.next;
            if(num2 == null)
                throw new IllegalArgumentException();
            i++;
        }while(i<=k-1);
        while(num2 != till){
            num1 = num1.next;
            num2 = num2.next;
        }
        return num1.value;
    }


/*
    public void addFirst(int item){
        var node = new Node(item);
        if(count ==0){  head = node = till; }
        else{
            node.next = head;
            head = node;
        }
        count++;
    }

*/
}
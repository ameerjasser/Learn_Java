package com.mycompany.firstproject.UniversityClass.Sem2.Individual2;

public class MyLinkedList {
    private int[] arr;
    private int count;
    private Node head;
    private Node tail;
    class Node{
        String value;
        Node next;
    }
    public void add(String input){
        Node item = new Node();
        item.value = input;
        if(isEmpty()){
            head = tail = item;
        }
        else{
            tail.next = item;
            tail = item;
        }
        count++;
    }
    public void removeFront(){
        if(isEmpty()) throw new IllegalArgumentException("The list is empty11!!!");
        Node temp = head;
        head = head.next;
        temp.next = null; 
        count--;
    }
    public void removeBack(){
        if(isEmpty()) throw new IllegalArgumentException("The list is empty22!!!");
        if(head.equals(tail)){
            head = tail = null;
        }else{
            Node cournt = head;
            while(!cournt.next.equals(tail)){  /// we want to stop on the node just before the tail(last node)
                cournt = cournt.next;
            }
            cournt.next = null;                // remove the last node, then reset the tail
            tail = cournt;
        }
        count--;
    }
    public String accessFirst(){
        return head.value;
    }
    public String accessLast(){
        return tail.value;
    }
    public void printAll(){
        if(isEmpty()) throw new IllegalArgumentException("The list is empty333!!!");
        Node cournt = head;
        System.out.print("The list is: ");
        for(int i=0; i<count-1; i++){
            System.out.print(cournt.value + ", ");
            cournt = cournt.next;
        }
        System.out.println(cournt.value);
    }
    public boolean isEmpty() {
        return count==0;
    }
}

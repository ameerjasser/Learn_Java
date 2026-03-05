package com.mycompany.firstproject.DataStractures.LinkedLists;

//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        java.util.LinkedList<String> x = new java.util.LinkedList<>();

        //x.removeFirst();
        //list.deleteFirst();
        list.addLast(10);
        list.addLast(20);
        list.addLast(90);
        list.addLast(30);
        list.deleteLast();
        System.out.println(list.indexOf(90));
        System.out.println(list.contains(0));
    }
}

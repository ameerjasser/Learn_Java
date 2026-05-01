package com.mycompany.firstproject.UniversityClass.Sem2.Individual2;

public class Main {
    public static void main(String[] args) {
        var list = new MyLinkedList();
        list.add("50");
        list.add("62");
        list.add("66");
        list.printAll();
        list.removeBack();
        list.printAll();
    }
}

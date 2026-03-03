package com.mycompany.firstproject.DataStractures;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.remove(0);
//        System.out.println(list);

        Array arr = new Array(3);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
       // arr.removeAt(2);
        arr.print();
        System.out.println(arr.indexOf(2));
        System.out.println(arr.max());
        System.out.println(Arrays.toString(arr.intersect(new int[]{1, 2, 5})));
        System.out.println(arr.reverse());
        arr.insertAt(10, 1);
        arr.print();

    }
}

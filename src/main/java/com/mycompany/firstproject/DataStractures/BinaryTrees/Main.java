package com.mycompany.firstproject.DataStractures.BinaryTrees;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();

        tree.insert(5);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        //tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(11);
        tree.insert(3);
        tree.insert(8);
        //TODO: you have done with calculate the depth by just the left part now solve for the left and right.
        // tree.insert(8);
        // // tree.insert(26);
        // System.out.println(tree.find(8));
        //tree.traversePreOrder();
        tree.hight();
    }
}

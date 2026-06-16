package com.mycompany.firstproject.DataStractures.BinaryTrees;

public class MyBinaryTree {
    private Node root;
    class Node{
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node value: " + value;
        }
    }
    
    public void setRoot(int root){
        this.root.value = root;
    }

    public void insert(int item){
        var newNode = new Node(item);
        if(root == null){
            root = newNode;
            return;
        } 

        var current = root;
        current = lookUp(item);
        // if(current.value > item){
        //     current.leftChild = newNode;
        // }else{
        //     current.rightChild = newNode;
        // }
        
    }
    public boolean find(int value){

        var current = root;
        while(current != null){
            if(current.value > value){
                current = current.leftChild;
            }
            else if(current.value < value){
                current = current.rightChild;
            }
            else{
                return true;
            }
        }

        return false;

    }
    private Node lookUp(int item) {
        var current = root;
        var newNode = new Node(item);
        while(current != null){  /// need to cheack the condation // if the tree is Empty
            if(current.value == item) return current;

            if(current.value > item){
                if(current.leftChild == null){
                    current.leftChild = newNode;
                    return current;
                } 
                current = current.leftChild;
            }
            else if(current.value < item){
                if(current.rightChild == null){
                    current.rightChild = newNode;
                    return current;
                }
                current = current.rightChild;
            }
        }
        return current;
    }
    //Breadth First (Level Order)
    public void breadthFirstTraversal(){
        var current = root;
        int level = 0;
        while(current != null){
            var temp = current;
            System.out.println(current.value);
            System.out.println(temp.leftChild.value);
            System.out.println(temp.rightChild.value);

        }
    }

    // Pre-order
    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        // Root (print)
        System.out.print(root.value);
        if(root.rightChild != null || root.leftChild != null || this.root != root){
            System.out.print(", ");
        }
        // Left subtree
        traversePreOrder(root.leftChild);
        // Right subtree
        traversePreOrder(root.rightChild);
        
        return; // TODO: 
    }
    
    // In-order
    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
        // Left -> Root(print) -> Right
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    // Post-order
    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }

        // Left -> Right -> Root(print)
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        if(root != this.root)
            System.out.println(root.value + ", ");
    }
}

package com.company;

class Node {
    int value;
    Node left;
    Node right;
}

class BST {

    public Node createNewNode(int val) {
        Node a = new Node();
        a.value = val;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node insert(Node node, int val) {
        //this is for first value only
        if (node == null) {
            return createNewNode(val);
        }
        //if val less than first value it goes left
        if (val < node.value){
            //go through insert function again to continue through tree
            node.left = insert(node.left, val);
        }
        //if val grater than first value it goes right
        if (val > node.value) {
            //go through insert function again to continue through tree
            node.right = insert(node.right, val);
        }
        //if val is equal to first value it goes left
        else if (val == node.value){
            //go through insert function again to continue through tree
            node.left = insert(node.left, val);
        }
        return node;
    }
}

public class Main {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
    }
}
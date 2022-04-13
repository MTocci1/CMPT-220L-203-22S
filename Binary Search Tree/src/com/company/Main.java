package com.company;

class Node {
    int value;
    Node left;
    Node right;
}

class BST {

    static int nodeCount = 0;

    public Node createNewNode(int val) {
        Node a = new Node();
        a.value = val;
        a.left = null;
        a.right = null;
        return a;
    }

    //This function allows new nodes to be added and placed in the correct spot
    public Node insert(Node node, int val) {
        //this is for first value only
        if (node == null) {
            return createNewNode(val);
        }
        //if val less than first value it goes left
        if (val < node.value) {
            //go through insert function again to continue through tree
            node.left = insert(node.left, val);
        }
        //if val grater than first value it goes right
        if (val > node.value) {
            //go through insert function again to continue through tree
            node.right = insert(node.right, val);
        }
        //if val is equal to first value it goes left
        else if (val == node.value) {
            //go through insert function again to continue through tree
            node.left = insert(node.left, val);
        }
        return node;
    }

    // this function searches the tree for a value
    public boolean ifValExists(Node node, int val) {
        // empty tree has no values
        if (node == null) {
            return false;
        }
        boolean valExists = false;

        // goes down the tree searching for the value
        while (node != null) {
            if (val < node.value) {
                node = node.left;
            } else if (val > node.value) {
                node = node.right;
            } else {
                valExists = true;
                break;
            }
        }
        return valExists;
    }

    public static int height(Node node) {
        // empty tree has a height of 0
        if (node == null) {
            return 0;
        }
        // use math max function to find the largest depth in the tree
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int getMinVal(Node node) {
        if (node == null) {
            System.out.println("Binary Tree is empty.");
            return -1;
        }
        // the smallest value will be on the far left
        while (node.left != null) {
            node = node.left;
        }
        return node.value;
    }

    // this function is the same as finding Min except we go to the right
    public int getMaxVal(Node node) {
        if (node == null) {
            System.out.println("Binary Tree is empty.");
            return -1;
        }
        // the largest value will be on the far right
        while (node.right != null) {
            node = node.right;
        }
        return node.value;
    }

    public Node getNthLargest(Node node, int n) {
        // empty tree has no largest value
        if (node == null) {
            return null;
        }
        // largest numbers will be on the right side, so start there
        Node right = getNthLargest(node.right, n);
        if (right != null) {
            return right;
        }
        // add to the amount of nodes that have been visited
        nodeCount++;
        // if the n equals number of nodes visited run print statement
        if (nodeCount == n) {
            System.out.println(n + "th largest value in the tree is " + node.value);
            return node;
        }
        // if value is not found, search the left side of tree
        return getNthLargest(node.left, n);
    }
}

public class Main {
    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        // adds new nodes to the tree
        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 9);


        // searches if a value is in the tree
        System.out.println("Does the value 3 exist in the binary tree? " + a.ifValExists(root, 3));
        System.out.println("Does the value 4 exist in the binary tree? " + a.ifValExists(root, 4));

        // checks the height of the tree
        System.out.println("The height of the binary tree is " + a.height(root));

        // checks the smallest value of the tree
        System.out.println("The smallest value of the binary tree is " + a.getMinVal(root));

        // checks the largest value of the tree
        System.out.println("The largest value of the binary tree is " + a.getMaxVal(root));

        // finds the nth largest value, in this case it is the 2nd largest
        a.getNthLargest(root, 2);
    }
}

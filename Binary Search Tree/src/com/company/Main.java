package com.company;

public class Main {
    public static void main(String[] args) {
        // creation of tree
        BST a = new BST();
        Node root = null;

        // adds new nodes to the tree
        root = a.add(root, 8);
        root = a.add(root, 3);
        root = a.add(root, 1);
        root = a.add(root, 10);
        root = a.add(root, 6);
        root = a.add(root, 14);
        root = a.add(root, 4);
        root = a.add(root, 7);
        root = a.add(root, 13);


        // searches if a value is in the tree
        a.ifValExists(root, 6);
        a.ifValExists(root, 4);

        // checks the height of the tree
        System.out.print("Height: ");
        System.out.println(a.height(root));

        // checks the smallest value of the tree
        System.out.print("Min Val: ");
        System.out.println(a.getMinVal(root));

        // checks the largest value of the tree
        System.out.print("Max value: ");
        System.out.println(a.getMaxVal(root));

        // finds the nth largest value, in this case it is the 2nd largest
        a.getNthLargest(root, 2);

        System.out.println("Printing In Order:");
        a.inOrder(root);
        System.out.println("Printing Pre Order:");
        a.preOrder(root);
        System.out.println("Printing Post Order:");
        a.postOrder(root);
        System.out.println("Printing Breadth Order:");
        a.breadthSearch(root);
        System.out.println("Printing Depth Order:");
        a.depthSearch(root);

        a.delete(root, 6);
        a.ifValExists(root, 6);

    }
}


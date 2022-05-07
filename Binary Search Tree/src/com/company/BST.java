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
    public Node add(Node node, int val) {
        //this is for first value only
        if (node == null) {
            return createNewNode(val);
        }
        //if val less than first value it goes left
        if (val < node.value) {
            //go through insert function again to continue through tree
            node.left = add(node.left, val);
        }
        //if val grater than first value it goes right
        if (val > node.value) {
            //go through insert function again to continue through tree
            node.right = add(node.right, val);
        }
        //if val is equal to first value it goes left
        else if (val == node.value) {
            //go through insert function again to continue through tree
            node.left = add(node.left, val);
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
        System.out.println("Does " + val + " exist in the binary tree? " + valExists);
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

    public Node delete(Node node, int val) {
        // if the tree is empty
        if (node == null)
            return node;

        // if tree is not empty go down tree
        if (val < node.value)
            // if val is less go left
            node.left = delete(node.left, val);
        else if (val > node.value)
            // if val is greater go right
            node.right = delete(node.right, val);

        // if val is equal to the node's value then it is deleted
        else {
            // node with only one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // node with two children
            node.value = getMinVal(node.right);
            // Delete the successor
            node.right = delete(node.right, node.value);
        }
        return node;
    }
    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        // print left first because they have smaller values
        inOrder(node.left);
        // print the top
        System.out.println(node.value + " ");
        //print right
        inOrder(node.right);
    }
    public void preOrder(Node node) {
        if(node == null) {
            return;
        }
        // go down the tree from left to right
        // start by printing the root
        System.out.println(node.value + " ");
        // go down tree, starting left
        preOrder(node.left);
        // now right
        preOrder(node.right);
    }
    public void postOrder(Node node) {
        if(node == null) {
            return;
        }
        // start bottom left
        postOrder(node.left);
        //then right
        postOrder(node.right);
        // then top
        System.out.println(node.value+ " ");
    }
    public void breadthSearch(Node node) {
        // use height to determine amount of levels
        int h = height(node);
        int x;
        // use for loop for printing
        for (x = 1; x <= h; x++)
            printLevel(node, x);
    }
    public void printLevel(Node root, int level) {
        if (root == null)
            return;
        //print all values on level
        if (level == 1)
            System.out.println(root.value + " ");
        // recur down tree starting left and going right at each level
        else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }
    public void depthSearch(Node node) {
        if(node == null) {
            return;
        }
        // go down the tree from left to right
        // start by printing top
        System.out.println(node.value + " ");
        // go down tree, starting left
        depthSearch(node.left);
        // now right
        depthSearch(node.right);
    }
}


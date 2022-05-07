Mason Tocci
Binary Search Tree App

Functions in the app:
-add function
correctly places a new node onto the tree
first node added is the root, all other nodes are sorted (less than root
goes left, and greater than goes right)
example of use: root=a.add(root,8);
8 is the value being added in

-delete function and reorganization
saftly removes a node without destroying the order of the tree
the function will determine if a node has any children and organize from
there
a.delete(root, 6);
6 is the value being deleted from the tree

-Search if a value exists
uses a while loop to check the left and right side of the tree to see if
a value exists
example of use: a.ifValExists(root,8);
8 is the value being searched for
it will return a boolean for if it is in the tree

-height function
uses java's math.max function to determine which side of the tree has the
greatest height
example of use: System.out.println(a.height(root));
Needs the print statement because it is returning an int

-get minimum value
this function will return the value at the bottom left of the tree
because that is always the smallest value
example of use: System.out.println(a.getMinVal(root));
Also needs the print statement because it returns an int

-get maximum value
same as getting the minimum value except it returns the value at the
bottom right of the tree because that is always the largest
example of use: System.out.println(a.getMaxVal(root));

-get nth largest value
this function was difficult to make but basically I start at the bottom
right of the tree visiting each node from largest to smallest
A counter keeps track of how many nodes have been visited, once the
counter reaches the number the user inputs it will return that value
example of use: a.getNthLargest(root, 2);
this will search for the 2nd largest number

-Printing tree In Order 
Prints all values in the tree in ascending order
starts with left side of the tree, then the root, and then the right side
example of use: a.inOrder(root);

-Printing tree Pre Order
Prints all values, starting from the root, then printing the left side,
and then the right
example of use: a.preOrder(root);

-Printing tree Post Order
Prints all values, starting from the bottom left, then printing the right 
side, and then the root
example of use: a.postOrder(root);

-Printing Breadth Order
Prints all values, starting from the root, and then printing its children,
then their children and so on
example of use: a.breadthSearch(root);

-Printing Depth Order
Prints all values, starting from the root, then printing the left side,
and then the right
example of use: a.depthSearch(root);
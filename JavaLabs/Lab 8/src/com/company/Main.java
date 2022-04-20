package com.company;

public class Main {

    public static void main(String[] args) {
        listItem a = new listItem();
        listItem item = null;

        System.out.println("Printing out items in list:");
        //4 instances of the object
        item = a.add(null, 7);
        item = a.add(null, 4);
        item = a.add(null, 8);
        item = a.add(null, 5);

        item.remove(null, 8);

    }
}

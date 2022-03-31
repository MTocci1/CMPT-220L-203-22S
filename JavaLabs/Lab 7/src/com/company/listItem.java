package com.company;

public class listItem {
    int value;
    listItem listitem;

    //prints the objects in the order made
    public void printListItem(int val ) {
        System.out.print(val);
    }

    public listItem createListItem(int val ) {
        listItem a = new listItem();
        a.value = value;
        a.listitem = null;
        return a;
    }

    public listItem insert(listItem item, int val) {
        //create the list item
        if (item == null) {
            printListItem(val);
            return createListItem(val);
        }
        //this should not change the printing order but they should be in an order within the system
        else if (val < item.value){
            //go through insert function again to check each item
            item.listitem = insert(item.listitem, val);
        }
        return item;
    }
}
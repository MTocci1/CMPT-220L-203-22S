package com.company;

public class listItem {
    int value;
    listItem listitem;

    //prints the objects in the order made
    public void printListItem(int val ) {
        System.out.println(val);
    }

    public listItem createListItem(int val ) {
        listItem a = new listItem();
        a.value = value;
        a.listitem = null;
        return a;
    }

    // function to add items to list
    public listItem add(listItem item, int val) {
        //create the list item
        if (item == null) {
            printListItem(val);
            return createListItem(val);
        }
        //this should not change the printing order but they should be in an order within the system
        else if (val < item.value){
            //go through insert function again to check each item
            item.listitem = add(item.listitem, val);
        }
        return item;
    }
    // Remove item from the list
    public listItem remove(listItem item, int val) {
        if (item == null) {
            return item;
        }
        if (val != item.value) {
            item.listitem = remove(item.listitem, val);
        } else  {
            item.value = Integer.parseInt(null);
        }
        return item;
    }
}

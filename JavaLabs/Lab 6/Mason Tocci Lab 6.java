package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // Array
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Printing out numbers in the array: ");
        for (int number : list) {
            System.out.println(number);
        }
        // Array List
        ArrayList<Integer> a_list = new ArrayList();
        a_list.add(1);
        a_list.add(2);
        a_list.add(3);
        a_list.add(4);
        a_list.add(5);
        System.out.println("Printing out numbers in the ArrayList: ");
        for (int number2 : a_list) {
            System.out.println(number2);
        }
        // Linked List
        LinkedList<String> names_list = new LinkedList<String>();
        names_list.add("Joe");
        names_list.add("Mason");
        names_list.add("Derek");
        names_list.add("Cole");
        names_list.add("Patrick");
        System.out.println("Printing out numbers in the LinkedList: ");
        for (String name : names_list) {
            System.out.println(name);
        }
        // Queue
        Queue<String> name_queue = new LinkedList<String>();
        name_queue.add("Matthew");
        name_queue.add("Andrew");
        name_queue.add("Logan");
        name_queue.add("Jason");
        name_queue.add("Evan");
        System.out.println("Printing out numbers in the Queue: ");
        for (String name2 : name_queue) {
            System.out.println(name2);
        }
        // Stack
        Stack<String> shopping_list = new Stack<String>();
        shopping_list.push("banana");
        shopping_list.push("milk");
        shopping_list.push("ham");
        shopping_list.push("cheese");
        shopping_list.push("bologna");
        System.out.println("Printing out numbers in the Stack: ");
        for (String item : shopping_list) {
            System.out.println(item);
        }
        // plant class
        plant plant1 = new plant(needsWatering, plantFamily, Name);
        plant1.needsWatering = true;
        plant1.plantFamily = "Daisy";
        plant1.Name = "Sunflower";
        plant1.wateringInstructions();
        plant1.sunlightRequirements();
    }
}


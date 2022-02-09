package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Mason (Alex) Tocci
        // Prof. Kippins
        // Software Dev. 1
        // 2 February 2022

        // first statement
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = input.nextInt();

        if (age <= 40) {
            System.out.println("Wow, " + age + " is a lot younger than this program");
        }

        // second statement
        System.out.print("Heads or tails (lowercase)? ");
        String coin = input.next();

        if (coin.equals("heads")) {
            System.out.println("It was heads, good job!");
        } else {
            System.out.println("No, it was heads.");
        }

        // third statement
        System.out.print("Choose a pokemon (Squirtle, Charmander, Bulbasaur): ");
        String poke = input.next();

        if (poke.equals("Squirtle")) {
            System.out.println("Squirtle is a water type");
        } else if (poke.equals("Charmander")) {
            System.out.println("Charmander is a fire type");
        } else {
            System.out.println("Bulbasaur is a grass type");
        }

        // fourth statement
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Pick any year: ");
        int year = input.nextInt();

        if (year < 1999) {
            System.out.println("Hello " + name + ", " + year + " is less than 1999.");
        } else {
            System.out.println("Hello " + name + ", " + year + " is greater than 1999.");
        }

        // fifth statement
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.print("Heads or tails (lowercase)? ");
        String coin2 = input.next();

        if (num > 5 && coin2.equals("heads")){
            System.out.println("Your number was greater than 5 and you chose heads");
        }

        // sixth statement
        System.out.print("Is it in hand 1 or 2? ");
        String choice = input.next();
        System.out.print("Heads or tails (lowercase)? ");
        String coin3 = input.next();

        if (choice.equals("1") || coin3.equals("heads")){
            System.out.print("At least one of your choices was correct!");
        }

    }
}
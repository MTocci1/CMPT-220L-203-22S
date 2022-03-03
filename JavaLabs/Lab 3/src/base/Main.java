package base;

import java.util.Scanner;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = input.nextInt();

        if (age <= 40) {
            System.out.println("Wow, " + age + " is a lot younger than this program");
        }

        // Make an if, else statement where the else statement triggers a print or println statement
        System.out.print("Heads or tails (lowercase)? ");
        String coin = input.next();

        if (coin.equals("heads")) {
            System.out.println("It was heads, good job!");
        } else {
            System.out.println("No, it was heads.");
        }

        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        System.out.print("Choose a pokemon (Squirtle, Charmander, Bulbasaur): ");
        String poke = input.next();

        if (poke.equals("Squirtle")) {
            System.out.println("Squirtle is a water type");
        } else if (poke.equals("Charmander")) {
            System.out.println("Charmander is a fire type");
        } else {
            System.out.println("Bulbasaur is a grass type");
        }

        // Make 2 variables and use them in an if else conditional print from one of the sections
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Pick any year: ");
        int year = input.nextInt();

        if (year < 1999) {
            System.out.println("Hello " + name + ", " + year + " is less than 1999.");
        } else {
            System.out.println("Hello " + name + ", " + year + " is greater than 1999.");
        }

        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        System.out.print("Heads or tails (lowercase)? ");
        String coin2 = input.next();

        if (num > 5 && coin2.equals("heads")){
            System.out.println("Your number was greater than 5 and you chose heads");
        }

        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        System.out.print("Is it in hand 1 or 2? ");
        String choice = input.next();
        System.out.print("Heads or tails (lowercase)? ");
        String coin3 = input.next();

        if (choice.equals("1") || coin3.equals("heads")){
            System.out.print("At least one of your choices was correct!");
        }
    }
}

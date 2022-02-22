package com.company;
// Mason Tocci
// Prof. Kippins
// Software Dev 1
// 24 February 22

// https://www.markdownguide.org/cheat-sheet/

/**
 * Is this a list
 * idk
 */

/* Instead writing new code for every customer, I made a list for each
   inventory item (lemonade, pretzels, cash, and tips). Then, I used a
   for loop to add or subtract each number in the list from the total.
 */

public class Main {
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;


    public static void main(String[] args) {
        int[] pretzels_bought = {4,2,3,1,2,10,6,1,2,6,9};
        int [] cash_spent = {16,28,6,18,48,32,4,84,12,8,2,56,4,36,34};
        int [] lemonades_bought = {1,3,2,6,4,8,1,7,3,2};
        int [] tips_made = {4,10,5,10,4,3};
        dry_inventory (pretzels_bought, cash_spent, lemonades_bought, tips_made);
    }

    static void dry_inventory(int[] pretzels, int[] spent, int[] lemonade, int[] tip) {
        for (int amount : pretzels) {
            pretzels_available = pretzels_available - amount;
        }
        for (int money : spent) {
            cash = cash + money;
        }
        for (int lemons : lemonade) {
            lemonades_available = lemonades_available - lemons;
        }
        for (int money2: tip) {
            tips = tips + money2;
        }

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzels_available -= 4;
        cash += 8;
        lemonades_available -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzels_available -= 2;
        cash += 4;
        lemonades_available -= 3;
        cash += 24;

        //Customer 3
        pretzels_available -= 3;
        cash += 6;

        //Customer 4
        pretzels_available -= 1;
        cash += 2;
        lemonades_available -= 2;
        cash += 16;

        //Customer 5
        lemonades_available -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonades_available -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzels_available -= 2;
        cash += 4;

        //Customer 8
        pretzels_available -= 10;
        cash += 20;
        lemonades_available -= 8;
        cash += 64;
        tips += 10;


        //Customer 9
        pretzels_available -= 6;
        cash += 12;

        //Customer 10
        lemonades_available -= 1;
        cash += 8;

        //Customer 11
        pretzels_available -= 1;
        cash += 2;

        //Customer 12
        lemonades_available -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzels_available -= 2;
        cash += 4;

        //Customer 14
        pretzels_available -= 6;
        cash += 12;
        lemonades_available -= 3;
        cash += 24;

        //Customer 15
        pretzels_available -= 9;
        cash += 18;
        lemonades_available -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}



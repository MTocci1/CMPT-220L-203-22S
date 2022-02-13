package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Mason (Alex) Tocci
        // Prof. Kippins
        // Software Dev. 1
        // 2 February 2022

        //Switch Case
        String weapon = "Shotgun";

        switch (weapon) {
            case "Shotgun":
                System.out.println("Shotguns are very good for close-ranged combat.");
                break;
            case "Sniper":
                System.out.println("Snipers are very good for long-ranged combat.");
                break;
            case "Assault Rifle":
                System.out.println("Assault Rifles are great for mid-ranged combat.");
                break;
            default:
                System.out.println("Interesting, I wonder what weapon is you favorite.");
        }

        // For loop
        for (int x = 2; x < 7; ++x) {
            System.out.println("Printing: " + x);
        }

        // While loop
        int start = 0;
        int number = 4;
        while (start != number) {
            System.out.println("We have not found the number yet");
            start++;
        }
        System.out.println("We found the number! It was " + number);

        // Call function one
        int base = 4;
        int power = 6;
        double answer1 = exponent(base, power);
        System.out.println("4 to the power of 6 is " + answer1);

        // Call function two
        int[] list_of_nums = {1,2,3,1,1,5,1};
        int total = occurrence(list_of_nums);
        System.out.println("The number of 1's in the array is " + total);

        // Call function three
        int sum = summation(list_of_nums);
        System.out.println("The sum of the numbers in the array is " + sum);

        // Call function 4
        int a = 3;
        int b = 4;
        double pythag = pythagorean(a, b);
        System.out.println("The hypotenuse of a triangle with legs of length 3 and 4 equals " + pythag);
    }
        // Function One

        public static double exponent(int base, int power) {
            double answer = Math.pow(base, power);
            return answer;
        }
        // Function Two
        public static int occurrence(int [] input) {
            int total = 0;
            for (int number : input) {
                if (number == 1) {
                    total = total + 1;
                }
            }
            return total;
        }
        // Function Three
        public static int summation(int [] input) {
            int start = 0;
            for (int number : input) {
                start = start + number;
            }
            return start;
        }
        // Function four
        public static double pythagorean (int a, int b) {
            double a_squared = exponent(a, 2);
            double b_squared = exponent(b, 2);
            double sum = a_squared + b_squared;
            double c = Math.sqrt(sum);
            return c;
        }
    }

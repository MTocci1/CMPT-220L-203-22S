package base;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
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

        // Give me an example of you using a for loop
        for (int x = 2; x < 7; ++x) {
            System.out.println("Printing: " + x);
        }

        // Give me an example of you using a while loop
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
    // For the following todos you'll probably want to define them below and then call them from the main function above.
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


    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}

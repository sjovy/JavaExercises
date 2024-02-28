package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // Exercise 1: Print out "Hello Thomas" on two lines
        String word1 = "Hello";
        String word2 = "Thomas";
        // System.out.println(word1 + "\n" + word2);

        /*
        // Exercise 2: Check if a year is a leap year
        int year;
        year = 2021;
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        */

        // Exercise 3: Print out the sum, difference, product and quotient of two numbers
        double num1, num2;
        num1 = 10;
        num2 = 33;
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("N/A");
            }
        }
    }
}

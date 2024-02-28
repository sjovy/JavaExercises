package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /*
        // Exercise 1: Print out "Hello Thomas" on two lines
        String word1 = "Hello";
        String word2 = "Thomas";
        System.out.println(word1 + "\n" + word2);


        // Exercise 2: Check if a year is a leap year
        int year;
        year = 2021;
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


        // Exercise 3: Print out the sum, difference, product and quotient of two numbers
            // Well, this was an unnecessary complicated way of doing it
               see, exercise 6.
            //
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

        // Exercise 4: Print out the average of three numbers
        double var1, var2, var3, res;
        var1 = 10;
        var2 = 33;
        var3 = 0;
        res = (var1 + var2 + var3) / 3;
        System.out.println(res);



        // Exercise 5: Take name as input and type it out
        // import of import java.util.Scanner at  top of file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Exercise 6: Input two numbers and print the sum/multiplication/division and subtraction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        */

        // Exercise 7: Input seconds and converts to hours, minutes and seconds, separated by ":"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);






    }
}

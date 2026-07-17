package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    static String message = "default message";

    public static void main (String[] args) {

        // Practice: class GrossPayCalculator;

        // 1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");

        payRate = scanner.nextDouble();
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        // 4. Display result
        System.out.println("Gross pay: " + grossPay);

        // Practice: class Blank;
/*
        Blank.fillInTheBlank("winter", 4, "cold");
        Blank.fillInTheBlank("summer", 0, "rainy");
 */

    }
}

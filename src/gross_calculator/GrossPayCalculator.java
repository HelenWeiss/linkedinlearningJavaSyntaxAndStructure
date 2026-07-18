package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    // Practice: class GrossPayCalculator; with Scanner, scanner.nextInt, scanner.close()

    static String message = "default message";

    public static void main (String[] args) {

        //  Get the number of hours worked the hourly pay rate
        int hours = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        //Multiply hours and pay rate
        double grossPay = hours * payRate;

        // 4. Display result
        System.out.println("Gross pay: " + grossPay);

    }

    // Practice: class GrossPayCalculator; my vision without Scanner
    public static double calculateSalary(int hours, double grossPay) {
        return hours * grossPay;
    }
}




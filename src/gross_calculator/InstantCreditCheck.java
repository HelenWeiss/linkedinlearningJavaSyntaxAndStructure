package gross_calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String [] args) {

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified: call of the method
        //isUserQualified(actualCreditScore, actualSalary);  // call of commented method void (returns nothing)

        //Check if the user is qualified and notify the user: call of the methods
        boolean qualified = isUserQualified(actualCreditScore, actualSalary);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        double requiredSalary = 25000;
        int reuqiredCreditScore = 700;

        if(creditScore >= reuqiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if(isQualified) {
            System.out.println("Congrats! You've been approved!");
        } else {
            System.out.println("Sorry, yu've been declined.");
        }
    }


/*
    public static void isUserQualified(int creditScore, double salary) {
        double requiredSalary = 25000;
        int reuqiredCreditScore = 700;

        if(creditScore >= reuqiredCreditScore && salary >= requiredSalary) {
            System.out.println("Congrats! You've been approved!");
        } else {
            System.out.println("Sorry, yu've been declined.");
        }
    }
*/
}

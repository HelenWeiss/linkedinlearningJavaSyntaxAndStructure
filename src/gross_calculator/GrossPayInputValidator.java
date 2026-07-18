package gross_calculator;

import java.util.Scanner;

public class GrossPayInputValidator {

    // Practice: class GrossPayInputValidator; with Scanner, scanner.nextInt, scanner.close()

    public static void main(String [] args) {

        //Initialize known values
        int payRate = 32;
        int maxHours = 40;

        // Get input for the unknown variables
        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        // Validate input
        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextInt();
        }

        scanner.close();

        //Calculate gross
        int gross = payRate * hoursWorked;

        // Output
        System.out.println("Gross pay is $" + gross);

    }


    // Practice: class GrossPayInputValidator; my vision without Scanner
    // in while loop the value always must be changed hoursWorked++; hoursWorked--;

    public int validateGrossPayInput(int payRate, int maxHours, int hoursWorked) {
        while(hoursWorked < 1 || hoursWorked > maxHours) {
            if (hoursWorked < 1) {
                System.out.println("Too few hours. Increasing...");
                hoursWorked++;
            }
            if (hoursWorked > maxHours) {            // more elegant and effective: else { instead of if (hoursWorked > maxHours){
                System.out.println("Too many hours. Decreasing...");
                hoursWorked--;
            }
        }
        return payRate * hoursWorked;
    }


}

package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {

    // Practice: class SalaryCalculator; with Scanner, scanner.nextInt, scanner.close()

    public static void main(String [] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales >= quota) {
            salary = salary + bonus;
            System.out.println("Congrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota. You were " + salesShort + " sales short.");
        }

        // Output
        System.out.println("The employee's pay is $" + salary);

    }

    // Practice: class SalaryCalculator; my vision without Scanner

    public  int calculateSalary(int sales) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        if (sales >= quota) {
            salary = salary + bonus;
            System.out.println("Congrats! You've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You didn't make your quota. You were " + salesShort + " sales short.");
        }
        return salary;
    }
}

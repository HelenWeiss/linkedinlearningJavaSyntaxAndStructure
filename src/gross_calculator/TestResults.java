package gross_calculator;

import java.util.Scanner;

// Display the letter grade for a student based on their test score

public class TestResults {

    // Practice: class SalaryCalculator; with Scanner, scanner.nextInt, scanner.close()
    public static void main(String [] args) {

        // Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determine the letter grade
        char grade;
        if(score < 60) {
            grade = 'F';
        }
        if(score < 70) {
            grade = 'D';
        }
        if(score < 80) {
            grade = 'C';
        }
        if(score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
    }

    // Practice: class SalaryCalculator; my vision without Scanner
    public char gradeScore(double score) {
        char grade;
        if(score < 60) {
            grade = 'F';
        }
        else if(score < 70) {
            grade = 'D';
        }
        else if(score < 80) {
            grade = 'C';
        }
        else if(score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        return grade;
    }

    // without variable grade
/*
    public char gradeScore(double score) {
        if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

*/
}

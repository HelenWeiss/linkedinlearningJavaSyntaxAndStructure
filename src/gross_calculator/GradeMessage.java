package gross_calculator;

import java.util.Scanner;

public class GradeMessage {
    // Practice: class GradeMessage; with Scanner, scanner.nextInt, scanner.close()
    // switch statements
/*
    public static void main(String [] args) {

        // Get the test score
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        // Determine the letter grade
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
    }
*/

    // Practice: class GradeMessage; with Scanner, scanner.nextInt, scanner.close()
    // switch expressions
    public static void main(String [] args) {

        // Get the test score
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder.";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade.";
        };
    }

    // Practice: class GradeMessage; my vision without Scanner

    public String gradeMessage(String grade) {
        String message;

        // Determine the letter grade
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }
        return message;
    }

}

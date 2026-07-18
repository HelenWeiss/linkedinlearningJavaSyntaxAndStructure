package objects;

// objects as method return types

import java.util.Scanner;

public class HomeAreaCalculatorWithMethodsReturn {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        Rectangle kitchen = getRoom(); // row 34 in public static Rectangle getRoom()
        Rectangle bathroom = getRoom(); // row 34 in public static Rectangle getRoom()

        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is:" + area);

        scanner.close();
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom() {
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        // to create objects in rows 13, 14: Rectangle kitchen = getRoom(); Rectangle bathroom = getRoom();
        return new Rectangle(length, width);
    }
}

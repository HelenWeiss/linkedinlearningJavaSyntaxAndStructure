package objects;

// instantiating / creating objects;
// Write a class that creats instances of the Rectangle class to find
// the total area of two rooms in a house.

public class HomeAreaCalculator {

    public static void main(String [] args) {

        //Option 1 to call a class Rectangle a method Rectangle without parameters (rows 8-12 in class Rectangle)
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);

        //Option 2 to call a class Rectangle a method Rectangle without parameters (rows 14-18 in class Rectangle)
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();
    }
}

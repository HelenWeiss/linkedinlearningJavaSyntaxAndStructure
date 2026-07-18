package objects;

public class Rectangle {

    private double length;
    private double width;

    //Constructor1 with no params: must be named as Class
    public Rectangle() {
        length = 0;
        width = 0;
    }

    //Constructor2 with setted params: must be named as Class
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    //  Methods to calculate Perimeter and Area
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    // Getters and Setters
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
}

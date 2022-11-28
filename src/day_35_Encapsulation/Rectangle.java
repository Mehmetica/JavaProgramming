package day_35_Encapsulation;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Side can't be negative or zero. Invalid input: " + width);
            System.exit(0);
        } else {
            this.width = width;
        }

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Side can't be negative or zero. Invalid input: " + length);
            System.exit(0);
        } else {
            this.length = length;
        }
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}




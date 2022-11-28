package day_31_Constructor;

public class Rectangle {
    public double lenght,width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }


    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public double calcArea (){
        return lenght*width;
    }
    public double calcPerimeter (){
        return (lenght+width)*2;
    }





}

package day_35_Encapsulation;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Side can't be negative or zero. Invalid input: " + side);
            System.exit(0);
        } else {
            this.side = side;
        }
    }

    double calcArea(){
        return side*side;
    }

    double calcPerimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }




}
class Square_Main_Class {
    public static void main(String[] args) {
        Square square1= new Square(4);

        square1.setSide(3);
        System.out.println("square1.getSide() = " + square1.getSide());
        System.out.println(square1 );




    }
}

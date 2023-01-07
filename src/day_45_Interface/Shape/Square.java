package day_45_Interface.Shape;

public class Square extends Shape  {

    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            throw new RuntimeException("invalid side: "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return " {" +
                super.toString()+
                "side=" + side +
                '}';
    }
}

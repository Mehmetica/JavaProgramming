package day_45_Interface.Shape;

public class Cube extends Shape implements Volume{



    private double side;
    public Cube(double side) {
        super("Cube");
        setSide(side);
    }


    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new RuntimeException("invalid side: "+side);
        }
        this.side = side;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "side=" + side +
                super.toString()+
                '}';
    }

    @Override
    public double volume() {
        return Math.pow(side,3);
    }
}

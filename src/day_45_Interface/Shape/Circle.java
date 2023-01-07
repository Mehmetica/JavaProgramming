package day_45_Interface.Shape;

public class Circle extends Shape{

    private double radius;

    public final  static double pi ;

    static {//direk ust satırda da pi yi belirleyebilirdik
        pi=3.14;
    }

    public Circle( double radius) {
        super("Circle");//constructor dan name i sildik ve parent den elen ismi sabit bir isme esitledik
       setRadius(radius);//radius belirlerken kontrol mekanizması koyduk
    }



    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("invalid radius: "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+//parent class ın to string metodunu da buraya ekledik
                "radius=" + radius +
                '}';
    }
}

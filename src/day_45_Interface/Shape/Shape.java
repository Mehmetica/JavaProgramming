package day_45_Interface.Shape;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    //burada önemli noıkta: normal class da aynı formulu  baska sekillerde kullnamıyoruz .
//    // abstract olsaydı , gövde vermeyecektik ve her subclass kendi formulunu yazacaktı.

//    public double area(){
//
//    }
//
//    public double perimeter(){
//
//    }
    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' ;


    }
}

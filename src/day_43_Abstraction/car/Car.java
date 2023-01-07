package day_43_Abstraction.car;

public abstract class Car {
    //soyut sınıf. nesen uretemezsin. concrete somut sınıf değildir.
    //abstraction is focusing on important things rather than details or implementation.
    //we don't show details to the user
    //abstract method is a method without an implementation area(); eat();
    //if we have a method that has multiple implementation , we use abstract class
    //once we had an abstract method in an abstract parent class, child classes have to implement that  method compulsorily
    //abstract methods can be overloaded and be override eat() --> eat(String food);
    //abstract class is meant to be a parent. provide variables and methods to other children.
    //abstract class is not a concrete class ,so we cannot create objects from this class.
    //it has same methods,variables and blocks as other classes
    //it cannot have constructor because we cannot create objects from this class and constructor is for creating objects
    //we don't make abstract methods final because these methods are meant to  be overrided,but we can also
    //

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }

        this.price = price;
    }

    public  void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}

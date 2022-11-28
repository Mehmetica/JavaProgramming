package day_30_CustomClass;

public class Car {//custom class ia a template for the objects. purpose of
    // the custom class is creating objects
    //instance oluşturarak , farklı nesnelerin bunları kullanmasını sağlıyoruz.
    // Her obje, bu instance nin farklı kopyalarını, farklı hafızada saklarlar

    public String brand;//5 attributes
    public String model;
    public String color;
    public int year;
    public double price;

//5 actions
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }
    public String toString() {
        return "Car : " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }
    public void start(){
        System.out.println("Started "+brand+" "+model);
    }
    public void stop(){
        System.out.println("Stopped "+brand+" "+model);
    }

}

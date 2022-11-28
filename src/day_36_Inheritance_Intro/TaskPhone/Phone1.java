package day_36_Inheritance_Intro.TaskPhone;

public class Phone1 {
    public String brand, size,color,model;
    public  double price;


    public void setInfo(String brand, String size, String color, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;

        this.price = price;
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber+" is calling");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting");

    }




}

package day_32_CustomClass_Constructors;

import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car("Toyota");
        Car car2= new Car("Toyota","Corolla");
        Car car3= new Car("Toyota","Corolla",2022);
        Car car4= new Car("Toyota","Corolla",2022,10000);
        Car car5= new Car("Toyota","Corolla",2022,10000,"Black");

        Car[] array = {car1,car2,car3,car4,car5};
        System.out.println(Arrays.toString(array));

    }
}

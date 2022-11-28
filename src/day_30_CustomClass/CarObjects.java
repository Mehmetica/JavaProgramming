package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Mercedes","C200","Black",2020,90_000);
        System.out.println("car1: "+car1);//every car object has these attributes

        Car car2 = new Car();
        car2.setInfo("BMW","520d","Grey",2022,50000.0);
        System.out.println("car2 = " + car2);

        Car car3 = new Car();
        car3.setInfo("Audi","Q8","White",2021,45000.50);
        System.out.println("car3 = " + car3);
        System.out.println("-----------------------------------------------");
//        Car[] cars = { car1,car2,car3};
        ArrayList<Car> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(cars);

        for (Car each: cars) {
            System.out.println(each.brand + " : "+each.price);
        }

        //recall//BMW 2005-2008 eligible for recall
        //Mercedes 1995-1997

        cars.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        cars.removeIf(p-> p.brand.equals("Mercedes") && p.year>=1995 && p.year<=1997);






    }
}

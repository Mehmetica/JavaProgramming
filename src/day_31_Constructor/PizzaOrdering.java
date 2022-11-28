package day_31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        //create 100 pizza objects , size S , cheese tapping 2 , pepperoni topping 3
        //create 100 pizza objects , size M , cheese tapping 3 , pepperoni topping 4
        //create 100 pizza objects , size L , cheese tapping 4 , pepperoni topping 5

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i <100 ; i++) {
            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println(pizzas.size());
        double total=0;

        for (Pizza each : pizzas) {
            total+=each.calcCost();
        }
        System.out.println("total = " + total);


    }
}

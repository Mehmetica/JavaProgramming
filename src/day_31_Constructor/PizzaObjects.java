package day_31_Constructor;

public class PizzaObjects {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('S',3,4);
        //System.out.println("pizza1.calcCost(pizza1) = " + pizza1.calcCost(pizza1));

        System.out.println("pizza1.calcCost() = " + pizza1.calcCost());
        System.out.println("pizza1 = " + pizza1);


    }
}

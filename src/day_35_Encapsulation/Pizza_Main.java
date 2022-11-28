package day_35_Encapsulation;

public class Pizza_Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("MediUm",0,4);
        System.out.println("pizza.calCost() = " + pizza.calCost());

        System.out.println(pizza);


    }
}

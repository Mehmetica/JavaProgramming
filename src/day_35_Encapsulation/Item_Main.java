package day_35_Encapsulation;

public class Item_Main {
    public static void main(String[] args) {
        Item item = new Item("banana",2,2);
        System.out.println("item.calcCost() = " + item.calcCost());
        System.out.println("item.getName() = " + item.getName());
        item.setQuantity(3);
        System.out.println("item.getQuantity() = " + item.getQuantity());
        System.out.println("---------------------------------------");

        item.setName("toilet paper");
        item.setQuantity(1);// item.setQuantity(2); error.
        System.out.println("item.getQuantity() = " + item.getQuantity());
        System.out.println("item.getName() = " + item.getName());

        System.out.println(item);



    }
}

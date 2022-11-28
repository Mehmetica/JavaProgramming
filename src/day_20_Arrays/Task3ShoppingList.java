package day_20_Arrays;

public class Task3ShoppingList {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        //1. find out the first index number of "Gloves"
        int count=0;
        for (String i : items) {

            if (i.equals("Gloves")) {
                System.out.println(count);
                break;
            }
            count++;
        }



        System.out.println("--------------------------------------");
        //2. find out if "iPad" is contained in the item list
        for (String i : items) {
            if (i.equals("iPad")) {
                System.out.println("true");
                break;
            }
        }

        System.out.println("----------------------------------------");
        // 3.Print the report of each shopping item
        //            name - price - #ID
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "-" + prices[i] + "-" + itemIDs[i]);
        }


    }
}

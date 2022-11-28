package day_35_Encapsulation;


public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public boolean isSpecial(String name) {
        boolean isSpecial = false;
        char[] charArray = name.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                isSpecial = true;
            }
        }

        return isSpecial;
    }

    public void setName(String name) {
        //true
        if (name.isEmpty() || name.isBlank() || !Character.isLetter(name.charAt(0)) || isSpecial(name)) {
            System.err.println("Invalid name: " + name);
            System.out.println("name can not be empty or blank\n" +
                    "name can not contain any special characters other than space\n" +
                    "name must start with letters\n");
            System.exit(0);
        } else this.name = name;


    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid price: " + unitPrice);
            System.out.println("Unit price can not be negative");
            System.exit(0);

        } else this.unitPrice = unitPrice;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Invalid price: " + quantity);
            System.out.println("The quantity can not be negative");
            System.exit(0);

        } else if (name.equalsIgnoreCase("toilet paper") && quantity > 1) {
            System.err.println("Toilet paper quantity can not be more than 1");
            System.exit(0);


        } else this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }

    public double calcCost() {
        return quantity * unitPrice;
    }


}

class Item_Main1 {
    public static void main(String[] args) {
        Item item = new Item("banana", 2, 2);
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



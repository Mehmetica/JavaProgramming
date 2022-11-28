package day_35_Encapsulation;

public class Candies {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.err.println("Invalid entry: "+quantity);
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0) {
            System.err.println("Invalid entry: "+price);
            System.exit(0);

        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candies(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
      setQuantity(quantity);
       setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }


    public String toString() {
      if (price==0){
          return "Candies{" +
                  "brand='" + brand + '\'' +
                  ", quantity=" + quantity +
                  ", price= free"  +
                  ", hasPeanuts=" + hasPeanuts +
                  '}';
      } else{
          return "Candies{" +
                  "brand='" + brand + '\'' +
                  ", quantity=" + quantity +
                  ", price= "  + price +
                  ", hasPeanuts=" + hasPeanuts +
                  '}';
      }
      }




}

package day_35_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid size entry: " + size);
            System.exit(0);
        } else this.size = size;

    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0) {
            System.err.println("Invalid quantity: " + numberOfCheeseTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {
            System.err.println("Invalid quantity: " + numberOfCheeseTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {
            System.err.println("Invalid quantity: " + numberOfCheeseTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {
            System.err.println("Invalid quantity: " + numberOfCheeseTopping);
            System.exit(0);

        } else this.numberOfCheeseTopping = numberOfCheeseTopping;

    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0) {
            System.err.println("Invalid quantity: " + numberOfPepperoniTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 3) {
            System.err.println("Invalid quantity: " + numberOfPepperoniTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 4) {
            System.err.println("Invalid quantity: " + numberOfPepperoniTopping);
            System.exit(0);

        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 5) {
            System.err.println("Invalid quantity: " + numberOfPepperoniTopping);
            System.exit(0);

        } else this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
       setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
       setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calCost(){
        int totalTopping=numberOfCheeseTopping+numberOfPepperoniTopping;
        int totalCost=0;

        if (size.equalsIgnoreCase("small")){
            totalCost= 10+(2*totalTopping);
        }if (size.equalsIgnoreCase("medium")){
            totalCost= 12+(2*totalTopping);
        }if (size.equalsIgnoreCase("large")){
            totalCost= 14+(2*totalTopping);
        }

        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size.toLowerCase() + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calCost() +
                '}';
    }
}


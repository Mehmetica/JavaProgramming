package day_35_Encapsulation;

public class Carpet {
    private double width, length, unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid width : " + width);
            System.exit(0);
        } else {
            this.width = width;

        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid length : " + length);
            System.exit(0);
        } else {
            this.length = length;

        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            System.err.println("Invalid unitPrice : " + unitPrice);
            System.exit(0);
        } else {
            this.unitPrice = unitPrice;

        }
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double total = 0;
        if (isPersian) {
            total = (width * length * unitPrice) + 200;

        } else total = width * length * unitPrice;

        return total;

    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=" + calcCost() +
                '}';
    }
}
class  CarpetMain{
    public static void main(String[] args) {
        Carpet carpet= new Carpet(8,3.7,20,true);
        System.out.println(carpet);

        //carpet.setLength(-3); error
        //carpet.setUnitPrice(0); error

        carpet.setUnitPrice(32);
        carpet.setWidth(5);
        carpet.setLength(8);
        carpet.setPersian(false);

        System.out.println(carpet);

    }

}

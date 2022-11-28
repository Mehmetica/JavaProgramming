package day_32_CustomClass_Constructors;

public class Carpet {
    //public access modifier can make the variable reachable among the PROJECT
    //  if you don't write public access modifier in front of the variable, it has default
    //  modifier and can be reachable only in that package

    public double width, lenght, unitPrice;
    public boolean isPersian;


    public Carpet(double width,double lenght , double unitPrice,boolean isPersian) {
        this.width = width;
        this.lenght=lenght;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }

    public double calCost(){
    double totalPrice=(width*lenght)*unitPrice;
    if (isPersian) totalPrice+=200;
    return totalPrice;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", unitPrice=$" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=$" + calCost() +
                '}';
    }
}

package day_33_Statics;

public class IphoneObjects {
    public static void main(String[] args) {
        Iphone iphone1= new Iphone();
        System.out.println(Iphone.brand);//we can call static variable via class name.
        // operator
        System.out.println(iphone1.model);// we can call instance variable via an object
        // that we created from that class


    }
}

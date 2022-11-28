package day_33_Statics;

public class Iphone {
    public static String brand ="Apple";
    public String model;
    public double price;
    public static  String OS = "iOS";
    public String color;
//*******************************************************************
//   public static void printModelAndPrice(){
//       System.out.println( model +" "+ price);
//   }
//
    // once the method is static, you can not call instance variables via this static method
    //statics can only share what the class has, since the instance are belong to an object
    //statics cannot share an instance variable

    //instance variables are belong to the object
    //static variables are belong to class
 //********************************************************************
    public void method1(){
       System.out.println(model+" "+price);
        System.out.println(OS);
    }

    //instance method can share/ use static variables.because the instances are
    // belong to object and objects come from a class.
//********************************************************************
public static void printOS(){//static method
    System.out.println(OS);
}//advances: you can use a static method without creating an object. you can call it
// through the Classname

    public void printOS2(){//instance method
        System.out.println(OS);
    }//you can call this method through creating an object. You can use this for
    // all instance variables

}

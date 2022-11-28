package day_34_Garbage_Collection;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;//It needs more than 1 step to set a value to an ArrayList.At this situation we use static block.
    //numbers= new ArrayList<>();
    //numbers.add(10);


    public Circle(double radius) {//constructor is to set instance variables
        this.radius = radius;
        //*****don't use constr to initilaze a static variable****** not efficent!!
        //pi=3.14;
        //constructor only for the instances
        // constructor will be executed everytime we create an object but pi is a
        // static member,so we shouldn't initilaze it here.we should initilaze in a static
        // block instead. this will reduce the memory usage
    }

    static {//is for setting the static variables

        //radius=5;
        //static methods don't accept instance variables. instances are made for
        // initiliaze for multiple times but static block  cannot do it.it works
        // only one time

        //initiliaze static variables only for one time at the begining and that's it!
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
   /* you can not use maninmethod to set the static variables just because mainmethos is a
        static. In order to set the static variables, you need to run that class. When you
        call a static variable from outside of the class by Class name, this won't run the
        main method and static variables won't be set.That's why we cannot use main method
        to set the static variables.*/

    }


}

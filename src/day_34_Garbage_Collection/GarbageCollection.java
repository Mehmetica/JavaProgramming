package day_34_Garbage_Collection;

import day_30_CustomClass.Dog;
import day_32_CustomClass_Constructors.Car;
import day_33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
//when the garbage collector finds an object that is not in usage(unreferenced) anymore,
// it runs the finalize() method and collects it and clears it, makes more memory, makes
// program faster by clearing it.
/*
        Dog d = new Dog();// d is a reference name.
        d=null;// d is unreferenced now.

        String str= null;//null keyword only be assigned to non-primitive data types
        //null means non existing, empty, none... no object has benn created

        String str2="";// this is not same as null. object is created
        System.out.println(str.toUpperCase());
*/
//----------------------------------------------------------------------------
        String str = "Wooden Spoon";
        //str is a reference and assigned to an object
        //not eligible for garbage collection
        str = null;//now eligible for garbage collection
        System.out.println(str);


        Car car1 = new Car("Toyota");
        car1 = null;//eligible for garbage collection
        System.out.println(car1);

        System.out.println("-----------------------");
        Dog dog1 = new Dog();
        dog1.name = "Lucy";//eligible for collection as garbage

        dog1 = new Dog();
        dog1.name = "alea";

        System.out.println(dog1);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>();

        list2 = list1;
        System.out.println(list2);
        System.out.println(list1);



    }
}

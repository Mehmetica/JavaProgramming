package day_34_Garbage_Collection;

public class StaticBlock {

    //after java 8 , you have to main method to run the program
    //before 8 , static block was enough to run
    public static void main(String[] args) {

        System.out.println("Main method");


    }

    static {// this runs first before everything and runs only for ***one time***
        //*****Always *****use this to initiliaze static variables because static variables
        // can be initiliazed only one time
        System.out.println("static block 1");


    }

    static {
        System.out.println("Static Block 2");
    }
    static {
        System.out.println("Static Block 3");
    }
}

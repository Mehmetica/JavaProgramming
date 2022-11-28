package day_32_CustomClass_Constructors;

public class ContructorCalls {

    public  ContructorCalls(){
        System.out.println("Default constructor");
     }
    public  ContructorCalls(int a){
        this();// the first constructor that we call now has no argument.
        System.out.println("Constructor with a int argument");
    }

    public  ContructorCalls(String str){
        this(10);
        //this constructor call must be at the first step
        // we can call max 1 cons.
        // cons call can be done by only a constructor

        System.out.println("Constructor with a String argument");

    }

    public static void main(String[] args) {
        ContructorCalls contructorCalls = new ContructorCalls();

        System.out.println("-----------------------------------------");
        ContructorCalls contructorCalls2 = new ContructorCalls(10);
        System.out.println("--------------------------------------------");

        ContructorCalls contructorCalls3 = new ContructorCalls("Ali");
        System.out.println("--------------------------------------------");



    }























}

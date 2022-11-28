package day_32_CustomClass_Constructors;

public class Test {
//constructor method overloading
    //linked methods / constructor chain
    public Test(){//A
        System.out.println("A");
    }
    public Test(int a){//A B
        this();//Since the calling cons met has no  argument, our () is blank
        System.out.println("B");
    }
    public Test(double a){//   A B C
        this(10);//Since the calling method has an int argument, we have to
        // give an int arg inside the  method
        System.out.println("C");
    }
    public Test(String a){//   A B C D
        this(10.4);//Since the calling method has a double argument,
        // we have to give an int arg inside the  method
        System.out.println("D");
    }


}

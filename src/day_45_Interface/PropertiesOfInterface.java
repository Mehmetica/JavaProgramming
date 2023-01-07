package day_45_Interface;

public interface  PropertiesOfInterface {//since the interface is all about the inheritance, you cannot declare the interface as final
    int a=100;
    static  int b=200;//stattic ve final olduklarından initilaze etmeliyiz. instance olarak bırakamayız
  /*  //constructors are for initiating objects. interface is a abstract blueprint and doesn't have objects
    public PropertiesOfInterface (int a){
        this.a=a;
    }

    //static blocks are meant to be executed as first when the class is implemented. but interface is not a class
    static {
        b=100;


    }*/

    /*//instance doesn't accept instance methods because they need object to run but interface doesn't have
    public void met1(){
        System.out.println( " ınstance method");
    }*/

//xxinterface abstract-static-default metodlar kullanabilir
    public static void  met2(){
        System.out.println("static method");
    }

    public abstract void met3();

    // ınheritance lar sadece abstract methodlar kullanmaz. implementation u aynı olan
    // class veya interface lere inheritance ederken default metodları kullanırlar.aynı impleentationu olan
    // classlar için boş, abstract metod kullanmaya gerek yok.bir daha bir daha metodun implementationuınu yazmaya gerek yok.ddd
    public default void drink(){
        System.out.println("defautlt mode");
    }
}

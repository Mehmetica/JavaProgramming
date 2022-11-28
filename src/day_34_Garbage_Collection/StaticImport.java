package day_34_Garbage_Collection;


   import static day_34_Garbage_Collection.Circle.   pi;//we don't need to import because they are at the same package
// import static package name             .ClassName.static object;//only call the statics members


public class StaticImport {
    public static void main(String[] args) {

        System.out.println(Circle.pi);//if they are in the same package, we can call it via class name without importing
        System.out.println(pi);//we can use directly after importing

    }
}

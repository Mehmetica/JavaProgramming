package day_34_Garbage_Collection;

public class StaticMembers {//outer classes don't have the static keyword

    public static int num = 200;//1. static variable( only 1 value for a object)

    public static void method() {//2. static method(if I use only static variables)
    }

    static {//3. static block(to set the static variables when they need more than 1 step to be set)
    }


    //---------------------------------------------------------------------

    static class class1 {//1. we need ***nested class*** in order to have a static class
        //2. only ***inner*** classes can have static keyword
        // nested class is not recommended

    }



}
class A{//outer class

    static class B{//inner class

        public static void method1(){//inner class's method


        }
    }
}
class C{
    public static void main(String[] args) {
        A.B.method1();/* when we try to reach to another class's inner class's method
        ,we need to call outer class first(A) then inner class(B) then the method*/
    }
}

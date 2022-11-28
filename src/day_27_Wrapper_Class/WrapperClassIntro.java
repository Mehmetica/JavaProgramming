package day_27_Wrapper_Class;

public class WrapperClassIntro {
    public static void main(String[] args) {
        //provide mechanism to convert primitive data types into object and vice versa.
        // This is done implicitly. Theese primitives need to be converted to objects by wrapper
        //classes in order to use them in other data structures like maps and collections
        int num1=200;
        Integer n1=num1;//Integer is the wrapper class only of int. You can't convert Long.
        //Long nu1=num1--> error
        //primitives can only be converted to it's wrapper class
        //but wrapper classes can be converted to anthr primitive as long as they are in the
        // range of wrapper class.
        int intValue=333;
        //Long longWrapper = intValue;//error . int primite can only be converted to Integer wrapper class
        Integer IntWrapper = intValue;

        long longValue = IntWrapper;//Integer wrapper--> long primitive unboxing olur.
        // çünkü long,int i içerebilir,daha büyüktür.
        //-----------------------------------------------
        Integer n2 = num1; //autoboxing. take the little one into big one. from right to left
        int num2=n2; // unboxing. n2 is a wrapper class--> num2 is a primitive .big to small


        //----------------------------------------------

        Byte byteWrapper = 25;

        byte b1= byteWrapper;
        short s1=byteWrapper;
        int i1=byteWrapper;
        long l1 = byteWrapper;
        //Byte wrapperclass olduğu için , primitive olarak kendinden daha geniş olan type lara
        //unboxing olabilir.hata vermez.


    }
}

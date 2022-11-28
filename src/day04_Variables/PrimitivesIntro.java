package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
//integer primitive variables-all integer numbers are default int-----------
//byte -128 +127  1byte
        //age =38 years old
        //variable names must be meaningful
        byte age = 38;
//short -32768 +32767 2 byte
        //weight=160;
        short weight = 160;

//int -2.147.483.648 +2.147.483.648 4 byte
        int a = 3213545;
//long 8 byte
        //defaultly nuımbers labled as int.
        long asset = 3_333_333_333L;// you have to put L to force the compiler to know this isa long
        //shen  out of int range you have to put L.

//------------------------------------
//float point datatype
        float tax = 0.26f;//4 byte
        double d = 2.57;//8 byte
// -------------------------------------
//char 2bytes
        char c = 'a';
        System.out.println("c = " + c);
        char as = 35000;// 35000 e karşılık gelen karakteri basar.
        System.out.println("as = " + as);
        //char df = 'df';
        //System.out.println("df = " + df); only use with 1 character.
//---------------------------------------------
        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100>300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
//------------------------String : sequence of characters-------------------

        String first_name$ = "Ali";// _ and $ dont throw err. ypu cant start with 1234 ...
                                    // you cannot use java reserved names as variable names. abstract, do, double....
                                    //1 name for 1 variable. cannot be used for 2 variables.






    }

}

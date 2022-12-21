package day_41_ExceptionsIntro;

public class FinallyBlock {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        try {
            System.out.println(arr[10]);
            System.out.println("try block");
        }catch (RuntimeException w){
            w.printStackTrace();
            System.out.println("catch block");
        }finally {
            System.out.println("finally");
        }
    //finally blogunu durdurmanın tek yolu, ondan önce programı terminate etmektir.





    }
}

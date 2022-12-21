package day_41_ExceptionsIntro;

import day_31_Constructor.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked_TRY_CATCH {
    public static void main(String[] args) {

        //unchecked exception: compiler cannot detect while compiling. it is giving errors while running the code.
        //undetected error we can also say.

        int a = 10;
        int b =0;

       // System.out.println(a/b);  //unchecked exception

        char [] characters  ={'A','B','C'};
        //System.out.println(characters[99]); //unchecked exception.

        Student student =null;
        //System.out.println(student.toString());//you cannot use tostring methof of non exisitng object but compiler cannot detect this until run time

        try{
            System.out.println("try block");
            System.out.println(9/0);
        }catch (ArithmeticException e){
            System.out.println("catch block");
            System.out.println("Arithmetic exception is occured: "+e);
        }
        System.out.println("------------------------------------------------------------------");

        try{
            System.out.println(characters[10000]);//unchecked exception.indexoutofboundexception
            System.out.println("try block");
        }catch (RuntimeException e){//runtime exception classı tüm unchecked exceptionların parent sınıfı olduğundan, hepsini halledebilir.
            //istersen direk daha tüm unchecked ve checked lerin atası olan Exception classını da yazabiliriz ama compiler ı boşuna yormamak için ,
            // eğer exception cinsini biliyorsak onu yazarız
            //unchecked için Runtime ı kullanırız.ancak daha alt exception sınıfına ait olduğunu biliyorsak onu yazmamaız daha iyi olur.
            System.out.println("catch block");
            System.out.println("Runtime exception is occured: "+e);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("test 2 started");
        try{//bu blokta sıkıntı yoksa burayı çalıştırır.önce bir dener, sıkıntı varsa catch çalışır. if-else gibi
            System.out.println(characters[10000]);
            System.out.println("try block");
        }catch (RuntimeException e){//burdaki e, try da denenen nesneyi temsil eder
           e.printStackTrace();// kodun sonu geldikten sonra exceptionla alakalı tüm detayları verir.terminate eder kodu.
            System.out.println(e.getMessage());//sadece özet exceptionu verir. kodun sonunu beklemez.terminate etmez kodu
        }
        System.out.println("test 2 completed");

        System.out.println();
        System.out.println("--------------------------------------------------");

        try {
            Thread.sleep(3000);
            System.out.println("try");
        } catch (InterruptedException e) {
            System.out.println("catch");
            e.printStackTrace();
        }

        System.out.println("---------------------------------");
        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}

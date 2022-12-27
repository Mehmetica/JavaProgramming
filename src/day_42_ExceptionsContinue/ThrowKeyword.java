package day_42_ExceptionsContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        //eskiden exit metod kullanıyorduk artık daha aciklayici olan exception atma kullaniyoruz
        //sadece exception atarken throw keyword unu kullaniriz
        System.out.println("enter your age : ");
        int age=new Scanner(System.in).nextInt();

        if (age<0){
            throw new InputMismatchException("You entered Invalid age : "+age);
        }
        if (age>=21){
            System.out.println("eligible");
        }else throw new RuntimeException("You gotta be at least 21");

       // throw new InterruptedException(); onunde bir check edilecek bir durum yokken kendi basina throw edemeyiz


    }
}

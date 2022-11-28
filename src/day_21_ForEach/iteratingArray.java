package day_21_ForEach;
import java.util.Arrays;
public class iteratingArray {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};

        for (int i =0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-------------------");

        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);

        }

        //numbers.fori  = array için for looop kısaltmasi





    }
}

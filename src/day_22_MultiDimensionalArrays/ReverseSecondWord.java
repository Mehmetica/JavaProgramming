package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I love Java";

        String[] array = sentence.split(" ");
        String reverse="";
        for (int i = array[1].length()-1; i >=0 ; i--) {
            reverse+=array[1].charAt(i);
        }

        //sentence.replaceFirst(array[1],reverse);
        array[1]=reverse;
        System.out.println(Arrays.toString(array));



    }
}

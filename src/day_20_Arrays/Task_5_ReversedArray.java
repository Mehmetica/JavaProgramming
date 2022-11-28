package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5_ReversedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //	5.  Write a program that can reverse an array of integers and returns it as new array
        //        ex:
        //            array = {1,2,3,4,5};
        //
        //        output:
        //            reversedArray = {5,4,3,2,1};
        System.out.print("Please enter the length of the array: ");
        int length = scan.nextInt();

        int[] array = new int[length];
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Please enter " + (i + 1) + ". number");
            array[i] = scan.nextInt();

        }


        for (int i = length - 1; i >= 0; i--) {
            reversedArray[length - 1 - i] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));


    }
}

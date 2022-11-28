package day_21_ForEach;

import java.util.Arrays;
import java.util.Scanner;

//1. Write a program that sort the array of integer in descending order
public class Task_1_DescendingArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int length = scan.nextInt();

        int[] array = new int[length];
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Please enter " + (i + 1) + ". number");
            array[i] = scan.nextInt();

        }
        Arrays.sort(array);
        for (int i = length - 1; i >= 0; i--) {
            reversedArray[length - 1 - i] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));





    }
}

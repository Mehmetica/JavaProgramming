package day_21_ForEach;

import java.util.Scanner;

//2. Write a program that can count the even and odd number from an array of integers
//
//			Note: MUST use for each loop
public class Task_2_Odd_Even_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int length = scan.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter " + (i + 1) + ". number");
            array[i] = scan.nextInt();
//            if (array[i] % 2 == 0) {
//                evenCount++;
//            }else oddCount++;

        }
        for (int i : array) {
            if (i % 2 == 0)
                evenCount++;
            else oddCount++;
        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);


    }
}

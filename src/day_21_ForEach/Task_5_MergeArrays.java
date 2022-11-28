package day_21_ForEach;

import java.util.Arrays;

/*    5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}*/
public class Task_5_MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] merged = new int[13];
        int i = 0;
        for (int element : arr1) {
            merged[i] = element;
            i++;
        }
        for (int element : arr2) {
            merged[i] = element;
            i++;
        }

        for (int element : arr3) {
            merged[i] = element;
            i++;
        }

        System.out.println(Arrays.toString(merged));

    }
}

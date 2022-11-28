package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6};
        System.out.println(Arrays.toString(remDup(arr)));

    }

    public static int[] remDup(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i : arr) {
            if (FrequencyOfElement.findFrequency(arr, i) == 1) {
                result[j++] = i;
            }
        }

        return result;
    }
}

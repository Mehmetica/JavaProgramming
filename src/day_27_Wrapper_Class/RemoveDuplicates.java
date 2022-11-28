package day_27_Wrapper_Class;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int[] array={1,1,2,2,3,3,6,5,5,8};
        System.out.println(Arrays.toString(removeDuplicates(array)));

    }

    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}

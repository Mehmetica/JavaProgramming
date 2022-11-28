package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeCharArray {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd'};
        char[] arr2 = {'a', 'b', 'c', 'd'};
        int [] intArray1 = {1,2,3};
        int [] intArray2 = {4,5,6};
        int [] intArray3 = {7,8,9};
        System.out.println(Arrays.toString(merge3Array(intArray1,intArray2,intArray3)));


        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    public static int[] merge3Array(int[] a, int[] b, int[] c) {


        int[] mergedInt = new int[a.length + b.length + c.length];
//
//
        int i = 0;
        for (int each : a) {
            mergedInt[i++] = each;
        }
        for (int each : b) {
            mergedInt[i++] = each;
        }
        for (int each : c) {
            mergedInt[i++] = each;
        }
        return mergedInt;
    }

    public static char[] mergeArray(char[] a, char[] b) {


        char merged[] = new char[a.length + b.length];
//
//        for (int i = 0; i < a.length; i++) {
//            merged[i] = a[i];
//        }
//        for (int i = a.length; i < a.length + b.length; i++) {
//            merged[i] = b[i - a.length];
//        }
//        return merged;
        int i = 0;
        for (char each : a) {
            merged[i++] = each;
        }
        for (char each : b) {
            merged[i++] = each;
        }
        return merged;
    }
}

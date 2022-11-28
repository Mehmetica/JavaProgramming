package day_27_Wrapper_Class;

import java.util.Arrays;

public class ReplaceTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(replace(arr,2,99)));

    }

    public static int[] replace(int[] array, int index, int element) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] replacedArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                replacedArr[i] = element;
            } else {
                replacedArr[i] = array[i];
            }
        }return replacedArr;
    }

    public static double[] replace(double[] array, int index, double element) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);}
        double[] replacedArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                replacedArr[i] = element;
            } else {
                replacedArr[i] = array[i];
            }
        }return replacedArr;
    }

    public static char[] replace(char[] array, int index, char element) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);}
        char[] replacedArr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                replacedArr[i] = element;
            } else {
                replacedArr[i] = array[i];
            }
        }return replacedArr;
    }

    public static String[] replace(String[] array, int index, String element) {
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);}
        String[] replacedArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                replacedArr[i] = element;
            } else {
                replacedArr[i] = array[i];
            }
        }return replacedArr;
    }
}

package day_27_Wrapper_Class;

import java.util.Arrays;

public class insertElementToArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(add(arr,2,99)));



    }
    public static int[] add(int [] arr, int index , int element){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (i==index) continue;
            newArr[i]=arr[i];

        }newArr[index]=element;
        return newArr;
    }

    public static double[] add(double [] arr, int index , double element){
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (i==index) continue;
            newArr[i]=arr[i];

        }newArr[index]=element;
        return newArr;
    }

    public static char[] add(char [] arr, int index , char element){
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (i==index) continue;
            newArr[i]=arr[i];

        }newArr[index]=element;
        return newArr;
    }

    public static String[] add(String [] arr, int index , String element){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (i==index) continue;
            newArr[i]=arr[i];

        }newArr[index]=element;
        return newArr;
    }
}

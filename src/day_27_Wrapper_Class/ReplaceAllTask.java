package day_27_Wrapper_Class;

import java.util.Arrays;

public class ReplaceAllTask {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,3,6,3};
        System.out.println(Arrays.toString(replaceAll(array,3,99)));


        
    }
    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        int [] newArray = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==oldElement){
                arr[i]=newElement;
            }
            newArray[i]=arr[i];
        }
        return newArray;


    }

    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        double [] newArray = new double[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==oldElement){
                arr[i]=newElement;
            }
            newArray[i]=arr[i];
        }
        return newArray;
    }

    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        char [] newArray = new char[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==oldElement){
                arr[i]=newElement;
            }
            newArray[i]=arr[i];
        }
        return newArray;
    }

    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        String [] newArray = new String[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==oldElement){
                arr[i]=newElement;
            }
            newArray[i]=arr[i];
        }
        return newArray;
    }
    
}

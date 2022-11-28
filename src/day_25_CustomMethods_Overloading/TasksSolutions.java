package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class TasksSolutions {
    public static void main (String[] args){
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10};


        System.out.println(Arrays.toString(merge(array1,array2)));

    }
    public static int[] merge(int [] a,int [] b){
        int [] mergedArray = new int[(a.length + b.length)];
        for (int i = 0; i <a.length ; i++) {
            mergedArray[i]=a[i];
        }
        for (int i = a.length; i <(b.length + a.length) ; i++) {
            mergedArray[i ] = b[i-(a.length)];
        }
        return mergedArray;

    }
}

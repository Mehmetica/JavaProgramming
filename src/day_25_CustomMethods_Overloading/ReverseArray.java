package day_25_CustomMethods_Overloading;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(rev(arr)));





    }public static void reverse(int [] a){
        int [] rev = new int[a.length];
        int j=0;
        for (int i = a.length - 1; i >= 0; i--) {
            rev[j]=a[i];
            j++;
        }
        System.out.println(Arrays.toString(rev));

    }
    public static int [] rev (int[] arr){//aynı reverse metodu. j int değişkeninin for
        // döngüsü içinde farklı kullanımı var
        int [] result= new int[arr.length];

        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]= arr[i];
        }
        return result;
    }
}

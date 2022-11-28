package day_26_CustomMethodsPractice;
import day_25_CustomMethods_Overloading.AddElementsToArray;//farklı paketteki metodu çagırdık

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int [] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));


    }

    public static int[] reverse(int[]array){
        int [] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result =AddElementsToArray.addInteger(result,array[i]);//farklı paketteki metodu kullanarak
            // tersten elementleri ekledik
        }
        return result;
        
    }

}

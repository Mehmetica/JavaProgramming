package day_26_CustomMethodsPractice;

import java.util.Arrays;

public class FrequencyOfElement {
    public static void main(String[] args) {
        String[] arr = {"ali", "ali", "mehmet", "hatice", "omer", "ali"};
        String key = "ali";
        int [] intArr ={1,2,3,4,4,4,5,5,5,6,6,7};

        System.out.println(findFrequency(arr, key));
        System.out.println(Arrays.toString(UniqueElements.uniqueElements(intArr)));

    }

    public static int findFrequency(String[] arr, String key) {
        int count = 0;
        for (String each : arr) {
            if (each == key)
                count++;
        }
        return count;
    }

    public static int findFrequency(int[] arr, int key) {
        int count = 0;
        for (int each : arr) {
            if (each == key)
                count++;
        }
        return count;
    }

    public static int[] addElement(int[] arr, int element) {
        int[] added =new int[arr.length+1];
        int i=0;
        for(int each : arr){
            added[i++] = each;
        }
        added[i]=element;
    return added;
    }
}

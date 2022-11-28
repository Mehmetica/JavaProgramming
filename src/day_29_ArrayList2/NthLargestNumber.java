package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
int n=3;
        for (int i = 0; i <(n-1) ; i++) {
            list.removeIf(p-> Collections.max(list)==p);

        }
        int max= Collections.max(list);
        System.out.println(n+"th max = " + max);


    }
}

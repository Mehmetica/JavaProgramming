package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,6,4,7,8));

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);




    }
}

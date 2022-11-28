package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,5,1,2,4,8,9,6,7,1));


        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {//finds the freq of each element
            int freq=Collections.frequency(list,each);
            if (freq==1){
                unique.add(each);
            }
        }
        System.out.println(unique);
        System.out.println("-------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,99,5,1,2,4,8,9,6,7,1));
        ArrayList<Integer> unique2 = new ArrayList<>(list2);
        unique2.removeIf(p -> Collections.frequency(unique2,p)>1 );//p ==each gibi
        System.out.println("unique2 = " + unique2);

    }
}

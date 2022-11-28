package day_29_ArrayList2;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);


        System.out.println(list);

        for (Integer integer : list) {
            int freq = 0;
            for (Integer each : list) {
                if (each == integer) {
                    freq++;
                }
            }
            if (freq == 1) {
                System.out.println(integer);
                break;
            }
        }


    }
}

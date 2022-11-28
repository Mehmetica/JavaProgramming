package day_29_ArrayList2;

import java.util.ArrayList;

public class MaxMinAvarage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);

        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int sum=0;
        for (Integer each : list) {
            if (each>max){
                max= each;
            }
            if(each<min){
                min=each;
            }
            sum+=each;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("Avarage: "+(double)(sum/list.size()));


    }
}

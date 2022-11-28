package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        //sort() :

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 6, 8, 9, 5, 4, 3, 2, 1));
        System.out.println("original: " + list);
        System.out.println("----------------------------");

        Collections.sort(list);
        System.out.println("sorted: " + list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("----------------------------");

        //reverse():
        Collections.reverse(list);
        System.out.println("reversed: " + list);//[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        System.out.println("----------------------------");
        //swap(): arraylist içindeki herhangi iki elemanın yerini değiştirmek için kullanılır

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        System.out.println("original list3: " + list3);
        Collections.swap(list3, 4, 1);
        System.out.println("swapped 1st and 4th element: " + list3);

        //max()-min()
        int max = Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("----------------------------");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20, 30,10,10,20,10, 40, 50, 60, 70));
        System.out.println("original list 4 : "+list4);
        Collections.replaceAll(list4,10,1000);
        System.out.println("replaceAll 10,1000: "+list4);

        System.out.println("----------------------------");

        int freq = Collections.frequency(list4,1000);
        System.out.println("freq of 1000 in list4 = " + freq);

        System.out.println("------------------------------");
        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList("java","java","ali","java","ali","mehmet"));
        System.out.println("list5 = " + list5);
        System.out.println("Collections.frequency(list5,\"java\") = " + Collections.frequency(list5, "java"));
        System.out.println("Collections.frequency(list5,\"ali\") = " + Collections.frequency(list5, "ali"));




































    }
}

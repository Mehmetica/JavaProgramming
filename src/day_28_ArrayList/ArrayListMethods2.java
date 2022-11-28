package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(500);
        System.out.println(list);

        boolean b1 = list.remove(Integer.valueOf(200));// Integer num=200; liat.remove(num);
        System.out.println("liat remove 200 = " + list);
        System.out.println(b1);//true
        boolean r2 = list.remove(Integer.valueOf(999));
        System.out.println(r2);//false

//        list.clear();
//        //0
//        System.out.println(list.size());

        System.out.println("list.indexOf(500) = " + list.indexOf(500));
        System.out.println("list.lastIndexOf(400) = " + list.lastIndexOf(400));
        System.out.println("--------------------------");
        ArrayList<Character> charArray= new ArrayList<>();
        charArray.add('a');
        charArray.add('b');
        charArray.add('c');
        charArray.add('c');
        charArray.add('c');
        charArray.add('c');
        charArray.add('c');
        charArray.add('c');
        charArray.add('d');
        charArray.add('e');
        charArray.add('e');
        System.out.println(charArray);
        System.out.println("charArray.indexOf('c') = " + charArray.indexOf('c'));
        System.out.println("charArray.lastIndexOf(c) = " + charArray.lastIndexOf('c'));


    }
}

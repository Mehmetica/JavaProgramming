package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (list.contains(each)) {
                continue;
            } else
                result.add(each);

        }
        System.out.println(result);

        System.out.println("******************************");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false çünkü new ile heap de yeni yer açtık.
        // aynı değiller
        System.out.println(list1.equals(list2)); // true. aynı sırada aynı elemanlar varsa

        System.out.println(list1.isEmpty());//false. String class ındaki gibi

        System.out.println("-----------------------");

        //Bulk Operation

        list1.addAll(Arrays.asList(1,2,3,4));//adAll metodu collection sınıfından
        // bir obje istediği için Array sınıfından asList metoduyla, verileri Collection
        // sınıfına çeviriyoruz
        System.out.println(list1);







    }
}

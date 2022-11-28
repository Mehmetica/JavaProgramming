package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //add or remove multiple elements at the same time
        //arguments must be a collection type

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,1,1,1,1,2,2,2,2,1));
        //Arrays.asList(): returns non primitive array to collection type(list e çeviriyor. list de bir
        // collection sınıfıdır)
        System.out.println(list);
        System.out.println("remove all ,ile  1 ler ve 2 ler silinsin ");
        list.removeAll(Arrays.asList(1,2));//index belirtmiyoruz. all matching elements
        // will be removed
        System.out.println(list);

        System.out.println("----------------------");
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,1,1,1,1,2,2,2,2,1));
        System.out.println("retainAll(Array.aslist(1,2)) yapınca sadece 1 ler ve 2 ler " +
                "kalır . gerisi silinir");
        list.retainAll(Arrays.asList(1,2));//sadece 1 ler ve 2 ler kalacak
        System.out.println(list);

        System.out.println("-------------");
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,1,1,1,1,2,2,2,2,1));
        System.out.println(list.containsAll(Arrays.asList(4,5)));//true. 4 & 5 içerir mi
        // sorar.
        System.out.println(list.containsAll(Arrays.asList(4,5,99)));//false 4 && 5 && 99
        // var mı?

        System.out.println("-------------------");
        String[] names = {"meh","hat","ömer","ali"};
        ArrayList<String > list1=new ArrayList<>();
        list1.addAll(Arrays.asList(names));//Arrays.asList ile names  non primitive(String)
        //  array ini bir collection sınıfına çevirdik

//Array --> ArrayList e çevirme: primitive olursa bu method uygulanmaz(Arrays.asList())
        //ArrayList<String > list1=new ArrayList<>(Arrays.asList(names)); names arrayindeki
        //tüm elemanlar artık list1 arraylist inde mevcut.Kısa yolu bu.

        System.out.println(list1);

        System.out.println("----------------------------");
        //primitive bir array i ArrayList e çeviremiyoruz
        Integer [] arr = { 1,2,3,4,5,6,7,8,9};//int [] arr olmuyor
        ArrayList<Integer> arrListInt = new ArrayList<>(Arrays.asList(arr));
//array to ArrayList manuel yapabiliriz . manuel olarak elemanları list e eklersek olur
        int [] array = {5368,6,13,3525,654};
        System.out.println(convertArrayToArrayList(array));





    }//array to ArrayList manuel yapabiliriz . manuel olarak elemanları list e eklersek olur
    public static ArrayList<Integer> convertArrayToArrayList(int [] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int each : arr) {
            arrayList.add(each);
        }
        return arrayList;
    }
}

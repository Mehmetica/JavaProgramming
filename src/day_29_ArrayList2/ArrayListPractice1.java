package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        //non-primitve array leri arrayList e asList metoduyla çevirebiliriz
        String[] countries = {"japan", "korea", "usa", "turkey", "uk", "canada"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 5);//uzunluğu 5 den büyük olan elemanları sil.

        //convert arraylist to array
        countries = list.toArray(new String[0]);//list will be converted to an array
        //in String type. We gave "0" for the lenght but it is not important because
        //this will be replaced by the list's size.

        System.out.println(Arrays.toString(countries));


    }
}

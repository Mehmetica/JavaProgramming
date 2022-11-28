package day_28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Pyhthon");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        System.out.println(findUnique(list));

        System.out.println(list.contains("Ruby"));//true
        System.out.println(list.contains("Mehmet"));//false



    }

    public static ArrayList<String> findUnique(ArrayList<String> arrayList) {
        ArrayList<String> unique = new ArrayList<>();
        for (String each : arrayList) {
            if (arrayList.indexOf(each) == arrayList.lastIndexOf(each)) {
                unique.add(each);

            }
        }
        return unique;
    }
}

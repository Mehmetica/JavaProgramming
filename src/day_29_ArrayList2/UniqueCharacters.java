package day_29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeef";
        //str.split("") non primitive type aray olduğundan, direk ArrayList sonundaki
        // parentez içinde kullanabiliriz


        String [] array =str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array));//aynı arraylist oluştu
        System.out.println(list);

        String unique="";
        for (String each : list) {
            int freq=Collections.frequency(list,each);
            if (freq==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
        System.out.println("*************************************");
        // primitive array ler , arrayList e manuel olarak çevirilebilir sadece
        int[] intArr = {1,2,3,4};
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i : intArr) {
            intList.add(i);
        }
        System.out.println("intList = " + intList);
        System.out.println("*************************************");


    }
}

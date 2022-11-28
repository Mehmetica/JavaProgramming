package day_29_ArrayList2;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        //remove all odd numbers
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                list.remove(list.get(i));//remove metodu iteration içinde kullanılamz.çünkü
                //collection da indexumber sabit degildir. her silinmede indexler değişecek
            }
        }
        System.out.println(list);//[2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8] hala 1 ler var

        System.out.println("--------------------------");

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        //remove less than 5 numbers
        list.removeIf(p -> p<5 );//p for each element. you can say whatever you want
        //Lambda Expression
        System.out.println(list);

        System.out.println("--------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove even numbers

        list2.removeIf(each -> each%2==0);
        System.out.println(list2);//[1, 3, 5, 7, 9]

        System.out.println("---------------------");

        //remove starts with "j"
        System.out.println("remove starts with j");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.addAll(Arrays.asList("ali","mehmet","java","hatice","jale"));
        System.out.println(stringArrayList);
        stringArrayList.removeIf(p->p.startsWith("j"));
        System.out.println(stringArrayList);//[ali, mehmet, hatice]

        System.out.println("----------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Eye","Cydeo"));
        System.out.println(names);
        names.removeIf(p-> StringUtility.isPalindrome(p));
        System.out.println("Remove palindromes\n" + names);//[Cydeo]








    }
}

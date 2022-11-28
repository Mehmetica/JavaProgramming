package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println("---------------------");
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         numbers.add(40);
         numbers.add(50);
        System.out.println(numbers);
        numbers.add(2,99);
        System.out.println(numbers);
        System.out.println();
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("numbers.get(3) = " + numbers.get(3));

        System.out.println("numbers.set(0,555) = " + numbers.set(0, 555));
        System.out.println("numbers = " + numbers);
        System.out.println();
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("----------------");


        names.add("Java");
        names.add("Python");
        names.add("C#");
        names.add("Ruby");

        names.set(0,"Mehmet");
        System.out.println(names);



    }
}

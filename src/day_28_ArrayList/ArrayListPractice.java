package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        System.out.println(numbers);

        numbers.remove(5);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(8));
        System.out.println(numbers);


    }
}

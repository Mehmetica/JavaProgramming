package day_21_ForEach;

import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 34, 3, 5, 8};
        for (int each : numbers) {
            System.out.print(each + "-");
        }
        System.out.println();
        System.out.println("--------------------------");
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number+" ");
        }

    }
}

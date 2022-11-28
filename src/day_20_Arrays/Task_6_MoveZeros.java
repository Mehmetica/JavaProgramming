package day_20_Arrays;
/*6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}*/

import java.util.Arrays;

public class Task_6_MoveZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] revers = new int[array.length];
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            revers[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(revers));


    }
}

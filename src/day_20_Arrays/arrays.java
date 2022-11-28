package day_20_Arrays;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        String[] colors={"blue","black","red","orange"};
        System.out.println(Arrays.toString(colors));

        System.out.println(colors.length);

    }
}

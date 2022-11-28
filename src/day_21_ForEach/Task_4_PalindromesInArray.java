package day_21_ForEach;

/*4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2*/
public class Task_4_PalindromesInArray {
    public static void main(String[] args) {
        String[] array = {"anna", "level", "java" };
        int count = 0;
        String reversed = "";
        for (String element : array) {
            System.out.println("element = " + element);
            for (int j = element.length() - 1; j >= 0; j--) {
                reversed += element.charAt(j);
            }
            System.out.println("reversed = " + reversed);
            if (element.equals(reversed))
                count++;
            reversed = "";
        }
        System.out.println("count = " + count);


    }
}

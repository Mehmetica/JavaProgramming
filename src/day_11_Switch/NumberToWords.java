package day_11_Switch;// Switch statement is faster in some kind of scenerios
// 0- 9 arası sayıları yazıya döken program
public class NumberToWords {
    public static void main(String[] args) {
        int number = 7;

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three"
                : (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ? "Seven"
                : (number == 8) ? "Eight" : "Nine"
                : "Invalid number";

        System.out.println("result = " + result);







    }
}

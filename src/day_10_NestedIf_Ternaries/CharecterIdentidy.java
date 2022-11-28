package day_10_NestedIf_Ternaries;

public class CharecterIdentidy {
    public static void main(String[] args) {
        char c= 's';

        if (c>='0' && c<='9'){
            System.out.println("Digit");
        } else if ((c >='A' && c<='Z') || (c>='a' && c<='z')) {
            System.out.println("Alphabetic");
        } else   {
            System.out.println("Special charecter");

        }


    }
}

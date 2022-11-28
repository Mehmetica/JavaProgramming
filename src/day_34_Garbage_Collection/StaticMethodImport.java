package day_34_Garbage_Collection;

import static utilities.StringUtility.reverse;//when you need only 1 method(memory saver)

public class StaticMethodImport {

    public static void main(String[] args) {
        /*We can call static variables by clas name without creating any object from that class */
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        /*When we call the Circle class, it's static block runs automatically and sets the
         static variables for 1 time.*/

        System.out.println("-----------------------");
/* I imported static methods from utuilitie package.StringUtility class.reverse method*/
        reverse("ali");// I can call reverse() method directly
        System.out.println("reverse(\"Mehmet\") = " + reverse("Mehmet"));


    }
}

package day_35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
      
        Candies candies1 = new Candies("A",10,15,true);
        Candies candies2 = new Candies("B",20,25,true);
        Candies candies3 = new Candies("C",30,35,false);
        Candies candies4 = new Candies("D",40,45,true);
        Candies candies5 = new Candies("E",50,55,false);

        ArrayList<Candies> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candies1,candies2,candies3,candies4,candies5));

        for (Candies each : candies) {
            System.out.print(each.getBrand()+" - ");
            System.out.println(each.getPrice());
        }
        



    }
}

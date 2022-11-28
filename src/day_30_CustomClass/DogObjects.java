package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
//        dog1.name = "Lucy";
//        dog1.breed = "Husky";
//        dog1.age = 5;
//        dog1.gender = 'F';
//        dog1.size = "Small";
//        dog1.color = "White";
        dog1.setInfo("Lucy","Husky",5,'F',"Small","White");

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog1.name = "Ace";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Large";
        dog1.color = "Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");
        System.out.println("dog3 = " + dog3);



        dog3.bark();
        Dog dog4 = new Dog();
        dog4.setInfo("Ali","labrador", 9,'M',"Large","Black");
        Dog dog5 = new Dog();
        dog5.setInfo("Omer","Kurt", 4,'M',"Small","Yellow");

        System.out.println("----------------------------------------");
        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};
        System.out.println(Arrays.toString(dogs));

        ArrayList<String> femaleDogs = new ArrayList<>();
        ArrayList<String> maleDogs = new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender=='M'){
                maleDogs.add(each.name);
            } else if (each.gender=='F') {
                femaleDogs.add(each.name);
            }
        }
        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);


    }

}

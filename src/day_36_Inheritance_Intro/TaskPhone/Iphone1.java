package day_36_Inheritance_Intro.TaskPhone;

public class Iphone1 extends Phone1 {
    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is calling");

    }
    public void faceTime(String email){
        System.out.println("You have email from "+email);

    }

}

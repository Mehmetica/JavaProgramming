package day_36_Inheritance_Intro.TaskBook;

public class AudioBook extends  Book{
    public int length;
    public String narrator;

    public void listen(){
        System.out.println("You are listening "+narrator);
    }
}

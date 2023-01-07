package day_44_Interface_Intro.Abstraction_Task;

public class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eaitng seed");

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");

    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");

    }
}

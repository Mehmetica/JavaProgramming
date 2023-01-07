package day_44_Interface_Intro.Abstraction_Task;

public class Cat extends Animal implements  Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }

    public void miow(){
        System.out.println(getName() + "is meowing");

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");

    }
}

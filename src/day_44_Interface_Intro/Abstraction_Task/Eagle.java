package day_44_Interface_Intro.Abstraction_Task;

public class Eagle extends Animal implements WildAnimal,Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating meat");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting bird");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }

}

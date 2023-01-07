package day_44_Interface_Intro.Abstraction_Task;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating sheep");

    }
    public  void roar(){
        System.out.println(getName() +" is roaring");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }
}

package day_38_InheritanceContinueMethodOverriding.Animal;

public class Cat extends Animal{
    public Cat( String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" cat food");
    }

}

package day_44_Interface_Intro.Abstraction_Task;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating Pizza");
    }

    public void bark(){
        System.out.println(getName() + "is barking");
     }

    @Override
    public void play() {//ınterface de bu method default olarak public olduğu için daha visible
        // bir access modifier olmadıgından mecbur public olacaktır
        System.out.println(getName()+" is playing");

    }
}

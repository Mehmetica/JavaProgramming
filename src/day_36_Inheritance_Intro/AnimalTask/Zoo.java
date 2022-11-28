package day_36_Inheritance_Intro.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Bully", "Buldog", "Black", "Large", 'M', 2);
        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();
        System.out.println(dog);
        System.out.println();

        Cat cat = new Cat();
        cat.setInfo("Bully", "Bulcat", "Black", "Large", 'M', 2);
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        cat.scratch();
        System.out.println(cat);
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.setInfo("Bully", "Bultiger", "Black", "Large", 'M', 2);
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();
        tiger.roar();
        System.out.println(tiger);


    }
}

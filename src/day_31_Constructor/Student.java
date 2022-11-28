package day_31_Constructor;

public class Student {
    String name;
    int age, id;
    char gender, grade;


    public Student(String name, int age, int id, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

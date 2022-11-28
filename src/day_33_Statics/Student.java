package day_33_Statics;

public class Student {

    public String name;
    public  char gender;
    public int age;
    public int studentID;
    public char grade;


    public String toString() {
        return "\nStudent name=" + name + '\'' +
                ",\n gender=" + gender +
                ",\n age=" + age +
                ",\n studentID=" + studentID +
                ",\n grade=" + grade +
                "\n " +
                '}';

    }

    public Student(String name) {
        this.name = name;
    }//1st constructor

    public Student(String name, char gender) {//constructor method overloading
        this(name);//1st constr
        this.gender = gender;
    }//2nd constr

    public Student(String name, char gender, int age) {//overloading
        this(name, gender);//2nd constr
        this.age = age;
    }//3rd constr

    public Student(String name, char gender, int age, int studentID) {//overloading
        this(name, gender, age);//3rd constr
        this.studentID = studentID;
    }//4th constr

    public Student(String name, char gender, int age, int studentID, char grade) {//overloading
        this(name, gender, age, studentID);//4th constr
        this.grade = grade;
    }//5th constr
//constructor only be called in another constructor and only one time and as a first method.

}

package day_33_Statics;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student("Mehmet");
        Student student2= new Student("Ahmet",'M');
        Student student3= new Student("Omer",'M',31);
        Student student4= new Student("Hatice",'F',33,3026);
        Student student5= new Student("Oguz",'M',34,3024,'A');

        Student[] array= new Student[]{student1,student2,student3,student4,student5};

        ArrayList<Student> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println(arrayList);


    }
}

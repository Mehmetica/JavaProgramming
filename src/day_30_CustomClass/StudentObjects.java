package day_30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student std1 = new Student();
        std1.setInfo("Ömer",'M',4,3026,'A');
        Student std2 = new Student();
        std2.setInfo("Mehmet",'M',34,3027,'B');
        Student std3 = new Student();
        Student std4 = new Student();
        Student std5 = new Student();

        std3.setInfo("asd",'F',44,3028,'C');
        std4.setInfo("wer",'F',84,3029,'D');
        std5.setInfo("hfggh",'M',14,3057,'A');




        Student[] students = {std1,std2,std3,std4,std5};
        for (Student each : students) {
            System.out.println(each);
        }

        ArrayList<Student> earlBirds=new ArrayList<>();//grade A
        ArrayList<Student> angryBirds=new ArrayList<>();//grade other than A

        for (Student each : students) {
            if (each.grade=='A'){
                earlBirds.add(each);
            }else angryBirds.add(each);
        }
        System.out.println("-----------------------");
        System.out.println("earlBirds = " + earlBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("--------------------------");//other solution
        ArrayList<Student> list =new ArrayList<>();
        for (Student student : students) {
            list.add(student);
        }

        ArrayList<Student> Alist =new ArrayList<>(list);

        Alist.removeIf(p-> p.grade!='A');
        System.out.println("Alist = " + Alist);
        ArrayList<Student> OtherList =new ArrayList<>(list);
        OtherList.removeIf(p->p.grade=='A');
        System.out.println("OtherList = " + OtherList);


    }
}

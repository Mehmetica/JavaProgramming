package day_34_Garbage_Collection;

//public class CydeoStudent {
//    public  String name;
//     public  static String schoolName;// = "Cydeo School";//if you can set the variable in one
//    // step, do it here.But if tou can't, do it in a static block. You can also set this in
//    // constructor method but it will  be memory consuming.
//
//    public CydeoStudent(String name) {
//        this.name = name;
//        //schoolName = "Cydeo School"; dont do this here. this set will repeat again and again
//        // whenever the constr is invoked
//    }
//
//    static {
//     schoolName ="Cydeo School";//set for 1  time. memory saver. no need to be set again.
//
//    }
//
//}
//
//class StudentObjects{
//
//    public static void main(String[] args) {
//
//
//        CydeoStudent student1 = new CydeoStudent("Ali");
//        CydeoStudent student2 = new CydeoStudent("Mehmet");
//
//        System.out.println(student1);
//
//    }
//}
public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;

    }

    static{
        schoolName = "Cydeo School";
    }

}


class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");



    }

}
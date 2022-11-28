package day_30_CustomClass;

public class Student {

    public String name;//instance variable
    public  char gender;
    public  int age;
     public  int ID;
     public  char grade;

//    public  void  setInfo(String name, char gender, int age ,int ID, char grade){
//       this.name = name;// when the instance variable has the same name with the local
//        // variable name(inside the method), we use this. to show instance variable and
//        // local variable are differenciated
//        //this keyword is using the call instance variable
//        this.grade=gender;
//        this.age=age;
//        this.ID=ID;
//        this.grade= grade;
//    }


    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
     public void code(){
         System.out.println(name+" is coding");
     }
     public void sleep(){
         System.out.println(name+" is sleeping");
     }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}

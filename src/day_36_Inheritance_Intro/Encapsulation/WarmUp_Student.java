package day_36_Inheritance_Intro.Encapsulation;

public class WarmUp_Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90) {
            System.err.println("Invalid input");
            System.exit(0);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid input");
            System.exit(0);//sadece return; diyerek setGender metodundan çıkabiliriz
            // ve diğer metodların çalışmasına engel olmayız
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;

        } else {
            return;
//            System.err.println("Invalid input");
//            System.exit(0);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public WarmUp_Student(String name, int age, char gender, char grade, String schoolName) {
        this.name = name;
        setAge(age);
        setGrade(grade);
        setGender(gender);
        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public String toString() {
        return "WarmUp_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

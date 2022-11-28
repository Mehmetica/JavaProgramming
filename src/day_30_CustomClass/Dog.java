package day_30_CustomClass;

public class Dog {//custom class lar sadece obje üretmek içindir.Main metodu olmak zorunda değil
    public  String name;//instance variable: bu classdan ürettiğimiz tüm objeler
    // bu instance leri kullanabilir. üretilen her köpek nesnesinin  ayrı ayrı instance variable
    // ismi olabilir.
    public  String breed;//custom objects,attributes
    public  int age;
    public char gender;
    public String size;
    public String color;


    public void eat(){ // custom methods,actions() Static kullansaydık sadece bir object için geçerli olurdu.
        //bu şekilde tüm instance objeler bu metodu kullanabilir
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }



    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setInfo(String dogName,String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age= dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }
}

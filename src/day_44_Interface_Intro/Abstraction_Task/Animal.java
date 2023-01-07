package day_44_Interface_Intro.Abstraction_Task;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age ;
    private  String size;
    private final String  color;

    public final static boolean canBreath ;

    static {

         canBreath = true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);//setter kulannamak daha iyi. tüm kosulları setter içinde yazabilirsin.
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')){// eger final ise setter olmayacağından koşulları burda tanımlamak zorundayız. boyle yazmak daha karısık oluyor.setter daha iyi
            throw new RuntimeException(gender + "is invalid");
        }
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw  new RuntimeException("name cannot be empty!");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {//final olduğundan setter ı olmaz.değitiriliemez
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            throw new RuntimeException("age cannot be lower than 0 "+ age);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public final void drink(){// we don't want to change this method. it's common for all subclasses. so it is final.every animal drinks
        System.out.println(name + " is drinking");
    }

    public abstract void eat ();//every animal may eat different things.detaya girmeden metodu yazdık.
    // ana sınıf olarak değişken ve metod sağlama görevimizi yerine getiriyoruz.



    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package day_36_Inheritance_Intro.TaskBook;

public class BookObjects {
    public static void main(String[] args) {


        EBook eBook = new EBook();
        eBook.setInfo("dfc","asd","saad",645646);
        System.out.println(eBook);

        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("Harry Potter","Finction","JKR",21);
        System.out.println(audioBook);

    }
}

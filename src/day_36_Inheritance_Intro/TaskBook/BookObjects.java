package day_36_Inheritance_Intro.TaskBook;

public class BookObjects {
    public static void main(String[] args) {


        EBook eBook = new EBook();
        eBook.setInfo("Java","Science","MG",21000,"Large",210);
        System.out.println(eBook);

        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("Harry Potter","Finction","JKR",21);
        System.out.println(audioBook);

    }
}

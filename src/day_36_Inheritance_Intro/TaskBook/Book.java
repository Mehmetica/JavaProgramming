package day_36_Inheritance_Intro.TaskBook;

public class Book {
    public  String title, type, author;
    public double price;


    public void setInfo(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }


    public String toString() {
        return "TaskBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

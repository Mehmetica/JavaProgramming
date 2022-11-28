package day_36_Inheritance_Intro.TaskBook;

public class EBook extends Book{
    public  String size;
    public int pages;


    public void setInfo(String title, String type, String author, double price,String size, int pages) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.size = size;
        this.pages = pages;
    }




    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void readBook(){
        System.out.println("You are reading"+ title);
    }
}

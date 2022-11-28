package day_36_Inheritance_Intro.TaskBook;

public class EBook extends Book{
    public  String size;
    public int pages;

    public void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    @Override
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

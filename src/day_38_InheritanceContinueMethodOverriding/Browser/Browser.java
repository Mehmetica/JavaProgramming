package day_38_InheritanceContinueMethodOverriding.Browser;

public class Browser {
    String name;

    public Browser(String name) {
        this.name = name;
    }

    public void openBrowser(){
        System.out.println("opening "+name+" browser");
    }
    public void closeBrowser(){
        System.out.println("closing "+name+" browser");
    }
}

package day_38_InheritanceContinueMethodOverriding.Browser;

public class Main {
    public static void main(String[] args) {
       ChromeBrowser chromeBrowser = new ChromeBrowser();
       chromeBrowser.openBrowser();
       Safari safari = new Safari();
       safari.closeBrowser();
       Firefox firefox = new Firefox();
       firefox.openBrowser();


    }
}

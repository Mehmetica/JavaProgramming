package day_11_Switch;

public class Browser {
    public static void main(String[] args) {
        String browserName="Opera";

        if (browserName.equals("Chrome") || browserName.equals("Firefox")
                || browserName.equals("Opera")|| browserName.equals("Safari")|| browserName.equals("Edge")   ){

            System.out.println(browserName+ " is selected");
        }else   System.out.println("Invalid Browser Name");


        System.out.println("-----------------------------");
//        String browserName1="";
//        boolean validBrowser = browserName1=="Chrome" || browserName1=="Firefox" || browserName1=="Opera" || browserName1== "Safari"
//                || browserName1=="Edge";
//
//        if (validBrowser){
//            if (browserName1=="Chrome")
//                System.out.println("Chrome is selected");
//            .....
//
//
//        }else System.out.println("Invalid browser");



    }
}

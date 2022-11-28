package day_11_Switch;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 7;
        String day = "";
        switch (number) {//her case den sonra brake koymalısın. 4 ü çalıştırdıktan sonra 5 i de çalıştırır yoksa.(dayi 5 atama yapar)
            // break görene kadar devam eder. yada ikinci curly braclet e kadar devam eder
            //long float double boolean kullanamayiz switch de!!!!!!!!!! diğer data type lar kullanılabilir
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default://sadece case lerin hiçbiriuygulanmazsa devreye girer. üst satırlara da yazılabilir.
                //aralarda yazılacksa break statemnet kesinlikle almalı.sonda olursa kapanış parantezine
                // yakın olduğundan koymaya gerek kalmaz.sen defaultu sona koy,break de koy ,kafan rahat olsun
                System.out.println("Invalid");
        }
        System.out.println("day = " + day);


    }
}

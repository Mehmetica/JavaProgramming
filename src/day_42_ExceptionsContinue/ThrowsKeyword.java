package day_42_ExceptionsContinue;

import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        //throws keyword provides handling the **"checked"** exceptions with writing less code. instead of using try catch block
        //everytime, just use the throws keyword and throw that  checked exception on front at the signiture.(beside the method)
        //fastest way to handle exceptions,clean,less codebut not the best way!not a permenant solution
        //disadvantages: temporary solution for compile error. if we call that method which includes throws keyword. the caller
        // will be responsible for that exception

        //if this method(including throw keyword) will not be used anywhere,than it is the best method to use throw

        //try catch is the b est solution to handle an exception ever
        System.out.println("Test 1");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");
        System.out.println("Test 1 is completed");

        System.out.println("Test 2");
        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 10 ");
        System.out.println("Test 2 is completed");





    }
}

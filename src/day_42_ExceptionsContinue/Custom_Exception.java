package day_42_ExceptionsContinue;
class FadyException extends RuntimeException{//custom unchecked exception
    public FadyException() {
        super("time to go");//runtime exceptiondan yazdırma metodunu aldık
    }

    public FadyException(String message) {
        super(message);
    }
}
class CheckedException extends Exception{//custom checked exception

}
public class Custom_Exception {
    public static void main(String[] args) {
        throw new FadyException();

        //throw new FadyException("lee lee boo");
    }
}

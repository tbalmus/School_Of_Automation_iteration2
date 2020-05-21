package exceptions;

public class MyUncheckedException extends NullPointerException{
    String message;

    public MyUncheckedException(String message) {
        super(message);
           }

}

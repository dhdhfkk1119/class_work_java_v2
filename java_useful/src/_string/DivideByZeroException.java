package _string;

public class DivideByZeroException extends Exception{

    private String message;

    public DivideByZeroException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

package amazon.week3.exceptions;

public class IDoNotDivideByOddNumbersException extends Exception {


    public IDoNotDivideByOddNumbersException(String message) {

        super(message);
    }

    @Override
    public String getMessage() {
        return "I cannot divide by odd numbers. ";
    }

    @Override
    public String getLocalizedMessage() {
        return "I cannot divide by odd numbers. ";
    }

}

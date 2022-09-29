package main.java.task3.exception;

public class FunctionCalculatorException extends RuntimeException {
    public FunctionCalculatorException() {
        super();
    }

    public FunctionCalculatorException(String message) {
        super(message);
    }

    public FunctionCalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}

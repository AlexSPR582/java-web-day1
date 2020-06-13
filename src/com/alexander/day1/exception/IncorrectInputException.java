package com.alexander.day1.exception;

public class IncorrectInputException extends Exception {
    public IncorrectInputException() {
        super();
    }

    public IncorrectInputException(String message) {
        super(message);
    }

    public IncorrectInputException(Exception exception) {
        super(exception);
    }

    public IncorrectInputException(String message, Exception e) {
        super(message, e);
    }
}

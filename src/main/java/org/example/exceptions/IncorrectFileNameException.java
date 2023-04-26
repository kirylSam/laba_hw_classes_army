package org.example.exceptions;

public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException(String exception, Throwable err) {
        super(exception, err);
    }

    public IncorrectFileNameException(String exception) {
        super(exception);
    }
}

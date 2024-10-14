package org.example;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message)  // неправильный размер массива
    {
        super(message);
    }
}

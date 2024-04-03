package com.example.demo111.MyExceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String args) {
        super(args);
    }

}

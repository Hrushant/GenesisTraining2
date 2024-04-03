package com.example.demo111.MyExceptions;

public class BookAlreadyExists extends RuntimeException {
    public BookAlreadyExists(String args) {
        super(args);
    }
}

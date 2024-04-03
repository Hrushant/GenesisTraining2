package com.kpit.myExceptions;

public class FlightNotFoundException extends RuntimeException{
    public FlightNotFoundException(String args){
        super(args);
    }
}

package com.example.demo13.myexceptions;

public class FixedDepositAccountNotFoudException extends RuntimeException {

    public FixedDepositAccountNotFoudException(String string) {
        super(string);
    }

}
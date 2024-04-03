package com.example.demo13.myexceptions;

public class FixedDepositAccountAlreadyExistsException extends RuntimeException {
    
    public FixedDepositAccountAlreadyExistsException(String str) {
        super(str);
    }
}

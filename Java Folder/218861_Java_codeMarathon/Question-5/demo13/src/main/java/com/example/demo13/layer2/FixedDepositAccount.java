package com.example.demo13.layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Fixed_deposite_account")
public class FixedDepositAccount {
    @Id
    @Column(name = "acno")
    private int accountNumber;

    @Column(name = "acname")
    private String accountHolderName;

    @Column(name = "acbal")
    private double accountBalance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "FixedDepositAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
                + ", accountBalance=" + accountBalance + "]";
    }

    

}

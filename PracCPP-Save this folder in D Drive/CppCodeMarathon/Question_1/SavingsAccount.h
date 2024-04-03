#ifndef SAVINGSACCOUNT_H
#define SAVINGSACCOUNT_H

#include <iostream>

class SavingsAccount
{
    double savingsBalance;
    static double annualInterestRate;

public:
    SavingsAccount();
    SavingsAccount(double);
    static double calculateMonthlyInterest(double);
    static double modifyInterestRate(double);
};

#endif // SAVINGSACCOUNT_H

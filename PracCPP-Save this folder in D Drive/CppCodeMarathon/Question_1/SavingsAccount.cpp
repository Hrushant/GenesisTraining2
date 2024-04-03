#include "SavingsAccount.h"

// Default constructor
SavingsAccount::SavingsAccount()
{
    savingsBalance = 10000;
}

// Parameterised constructor
SavingsAccount::SavingsAccount(double sBalance)
{
    savingsBalance = sBalance;
}

double new_Annual_Interest_Rate;
double SavingsAccount::modifyInterestRate(double n_a_i_r)
{
    return new_Annual_Interest_Rate = n_a_i_r;
}

double SavingsAccount::calculateMonthlyInterest(double savingsBalance)
{
    double calMonthlyInterest = (savingsBalance * new_Annual_Interest_Rate) / 12; // Calculate monthly interest
    savingsBalance = savingsBalance + calMonthlyInterest;          // Interest added in savingsBalance
    return savingsBalance;                                         // returns SavingsBalance
}

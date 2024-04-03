#include <iostream>
#include "SavingsAccount.h"

int main()
{
    SavingsAccount saver1, saver2;
    double new_Annual_Interest;
    std::cout << "For 3 % annual interest rate --> " << std::endl;
    std::cin>>new_Annual_Interest;
    saver1.modifyInterestRate(new_Annual_Interest);
    saver2.modifyInterestRate(new_Annual_Interest);
    std::cout << "New balance for saver 1 :" << saver1.calculateMonthlyInterest(2000.0) << std::endl;
    std::cout << "New balance for saver 2 :" << saver2.calculateMonthlyInterest(3000.0) << std::endl;

    std::cout << "---------------------------------" << std::endl;

    std::cout << "For 4 % annual interest rate --> " << std::endl;
    std::cin>>new_Annual_Interest;
    saver1.modifyInterestRate(new_Annual_Interest);
    saver2.modifyInterestRate(new_Annual_Interest);
    std::cout << "New balance for saver 1 :" << saver1.calculateMonthlyInterest(2000.0) << std::endl;
    std::cout << "New balance for saver 2 :" << saver2.calculateMonthlyInterest(3000.0) << std::endl;
}
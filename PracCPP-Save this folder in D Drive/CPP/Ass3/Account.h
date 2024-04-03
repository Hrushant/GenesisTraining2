#include <iostream>

class Account
{
    int accNo;
    char name[20];
    int balance;

public:
    Account();
    Account(int, const char *, int);
    void display();
};
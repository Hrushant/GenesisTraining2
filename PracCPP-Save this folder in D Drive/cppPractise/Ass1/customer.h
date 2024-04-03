#include <iostream>
#include <cstring>

class Customer
{
    int Id;
    char name[20];
    int age;

public:
    Customer();
    Customer(int, const char *, int);
    void display();
};
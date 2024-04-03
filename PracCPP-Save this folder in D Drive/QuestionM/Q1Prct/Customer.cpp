#include <iostream>
#include "Customer.h"
#include <string.h>

Customer::Customer()
{
    customername = new char[strlen(customername)];
    strcpy(customername, "Abhishek");
}

Customer::Customer(const char *nm)
{
    customername = new char[strlen(nm) + 1];
    strcpy(customername, nm);
}

Customer::Customer(const Customer &cc)
{
    customername = new char[strlen(cc.customername) + 1];
    strcpy(customername, cc.customername);
}

void Customer::Accept()
{
    std::cout << "Enter Customer Name : " << std::endl;
    customername = new char[strlen(customername)];
    std::cin >> customername;
}

Customer::~Customer()
{
    delete customername;
}

std::ostream &operator<<(std::ostream &os, const Customer &cc)
{
    os << "Customer Name : " << cc.customername;
    return os;
}

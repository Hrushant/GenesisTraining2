#include "Customer.h"

Customer::Customer()
{
    customername = new char[20];
    strcpy(customername, "Abhishek");
}

Customer::Customer(const char *nm)
{
    customername = new char[strlen(nm)+1];
    strcpy(customername, nm);
}

void Customer::display()
{
    std::cout << "Customer Name : " << customername << std::endl;
}

Customer::Customer(const Customer &cc)
{
    customername = new char[20];
    strcpy(customername, cc.customername);
}

void Customer::Accept()
{
    customername = new char[20];
    std::cout<<"Enter Customer name : "<<std::endl;
    std::cin>>customername;
}

Customer::~Customer()
{
    delete customername;
    std::cout<<"~Customer() called..."<<std::endl;
}

std::ostream &operator<<(std::ostream &os, const Customer &c)
{
    os <<"Customer name : "<< c.customername;
    return os;
}

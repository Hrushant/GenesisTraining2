#ifndef CUSTOMER_H
#define CUSTOMER_H

#include <iostream>
#include <cstring>

class Customer
{
    char *customername;

public:
    Customer();
    Customer(const char *);
    void display();
    Customer(const Customer &cc);
    void Accept();
    ~Customer();
    friend std::ostream &operator<<(std::ostream &os,const Customer &c);

    char *getCustomername() const { return customername; }
    void setCustomername(char *customername_) { customername = customername_; }
};

#endif // CUSTOMER_H

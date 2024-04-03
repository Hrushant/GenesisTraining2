#include <iostream>

class Customer
{
    char *customername;

public:
    Customer();
    Customer(const char *);
    Customer(const Customer &cc);
    void Accept();
    friend std::ostream &operator<<(std::ostream &os, const Customer &cc);
    ~Customer();

    char *getCustomername() const { return customername; }
    void setCustomername(char *customername_) { customername = customername_; }
};
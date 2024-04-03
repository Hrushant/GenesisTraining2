#include <iostream>
#include <cstring>
using namespace std;

class Customer
{
    int custId;
    char cName[20];
    int cAge;

public:
    Customer();
    Customer(int, const char *, int);
    void display();

    // int getCustId() const { return custId; }
    // void setCustId(int custId_) { custId = custId_; }

    // const char* getCName() const { return cName; }
    // void setCName(char *cName_) { strcpy(cName, cName_); }

    // int getCAge() const { return cAge; }
    // void setCAge(int cAge_) { cAge = cAge_; }
};
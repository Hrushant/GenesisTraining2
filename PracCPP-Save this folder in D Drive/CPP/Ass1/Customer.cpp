#include "customer.h"
#include <cstring>
Customer::Customer()
{
    custId = 101;
    strcpy(cName, "Harsh");
    cAge = 23;
}

Customer::Customer(int cId, const char *cNm, int cAg)
{
    custId = cId;
    strcpy(cName, cNm);
    cAge = cAg;
}

void Customer::display()
{
    cout << "Cust Id : " << custId << "\n";
    cout << "Cust Name : " << cName << "\n";
    cout << "Cust Age : " << cAge << "\n";
}

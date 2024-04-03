#include "Account.h"
#include <cstring>
using namespace std;

Account::Account()
{
    accNo = 401;
    strcpy(name, "Hrushant");
    balance = 90000;
}

Account::Account(int aNo, const char *name1, int bal)
{
    accNo = aNo;
    strcpy(name, name1);
    balance = bal;
}

void Account::display()
{
    cout << "Account number : " << accNo << "\n";
    cout << "Account Holder Name : " << name << "\n";
    cout << "Account balance : " << balance << "\n";
}

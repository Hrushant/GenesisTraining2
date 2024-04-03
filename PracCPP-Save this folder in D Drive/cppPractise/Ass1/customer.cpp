#include "customer.h"
using namespace std;

Customer::Customer()
{
    Id = 101;
    strcpy(name, "Ram");
    age = 79;
}

Customer::Customer(int custId, const char *nm, int ag)
{
    Id = custId;
    strcpy(name, nm);
    age = ag;
}

void Customer::display()
{
    cout<<"--------------------------------"<<endl;
    cout << "Id : " << Id << endl;
    cout << "name : " << name << endl;
    cout << "age : " << age << endl;
    cout<<"--------------------------------"<<endl;
}

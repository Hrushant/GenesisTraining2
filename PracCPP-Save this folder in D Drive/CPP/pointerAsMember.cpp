#include <iostream>
#include <cstring>
using namespace std;

class Customer
{
    char *custName; // using pointer
public:
    ~Customer() // Destructor  --> used to avoid memory leakage.
    {
        delete custName;  //delete memory pointed by custName pointer
        cout<<"~Customer --> custName deleted..."<<endl;
    }
    Customer() // Constructor
    {
        custName = new char[20]; // allocated in heap to store string
        strcpy(custName, "Ram");
        cout<<"Customer --> custName created..."<<endl;
    }
    Customer(const char *name)
    {
        custName = new char[strlen(name) + 1];
        strcpy(custName, name);
    }
    void display()
    {
        cout << "Name : " << custName << endl;
    }

    Customer(const Customer &cc2)  //cc2 is reference to c2 object
    { 
        custName = new char[strlen(cc2.custName)+1];
        strcpy(custName,cc2.custName);
    }
};

int main()
{
    Customer c1;
    c1.display();

    Customer c2("Lakshaman");
    c2.display();

    Customer *cptr = new Customer;
    delete cptr; // request to call destructor

    Customer c3(c2);   //Copy constructor --> Create one object copy of another object
    c3.display();
}
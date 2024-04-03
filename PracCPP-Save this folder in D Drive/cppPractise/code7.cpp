#include <iostream>
#include <cstring>
using namespace std;

class Customers
{
    char *name;

public:
    ~Customers()
    {
        delete name;
    }
    Customers()
    {
        name = new char[20];
        strcpy(name, "Ram");
    }
    Customers(const char *nm)
    {
        name = new char[strlen(nm) + 1];
        strcpy(name, nm);
    }
    void display()
    {
        cout << "Name : " << name << endl;
    }
    Customers(const Customers &cc)
    {
        name = new char[strlen(cc.name)+1];
        strcpy(name, cc.name);
    }
};

int main()
{
    Customers c1;
    c1.display();

    Customers c2("Sita");
    c2.display();

    Customers *ptr = new Customers("Lakshman");
    ptr->display();

    delete ptr;

    Customers c3(c2);
    c3.display();
}
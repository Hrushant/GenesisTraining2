#include <iostream>
#include <cstring>
using namespace std;

class Customer
{
    int id;
    char name[20];
    static int x;
    static int k;

public:
    static void show()
    {
        cout << x << endl;
    }
    Customer()
    {
        id = 101;
        strcpy(name, "Ram");
    }
    Customer(int i, const char *nm)
    {
        id = i;
        strcpy(name, nm);
    }
    void display()
    {
        cout << "id : " << id << endl;
        cout << "name : " << name << endl;
    }
    static void showx()
    {
        k++ ;
        cout << k << endl;
    }
};

Customer c1;
int Customer ::x = 1000;

int Customer::k = 1001;

int main()
{
    Customer c(102, "Siya");
    c.display();

    c1.display();

    cout << "_---------------------" << endl;
    Customer::show();

    Customer::showx();
}
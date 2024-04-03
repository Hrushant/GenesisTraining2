#include <iostream>
#include "customer.h"
using namespace std;

int main()
{
    Customer c;
    c.display();

    Customer c1(201, "Rameshwaray", 89);
    c1.display();

    Customer *ptr = new Customer(401, "Sham", 90);
    ptr->display();

    delete ptr;
    cout << "ptr deleted..." << endl;

    Customer cust[3] = {{111, "Krishna", 99}, {222, "Rama", 89}, {333, "ShriRama", 79}};
    for (int i = 0; i < 3; i++)
    {
        cust[i].display();
    }

    ptr->display();
}
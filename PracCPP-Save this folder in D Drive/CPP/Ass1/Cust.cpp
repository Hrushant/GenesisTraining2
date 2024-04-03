#include "customer.h"

int main()
{
    // Parameterised const -->
    Customer c(102, "Lakhan", 20);
    c.display();

    // Default const -->
    Customer c1;
    c1.display();

    // Parameterised const on heap memory -->
    Customer *ptr = new Customer(103, "Hrush", 19);
    ptr->display();

    // Default const on heap memory -->
    Customer *ptr1 = new Customer;
    ptr1->display();

    // Array of 3 obj and display them -->
    Customer cust[3] = {
        {201, "Ram", 30},
        {202, "Siya", 28},
        {203, "Lakshaman", 27},
    };
    for (int i = 0; i < 3; i++)
    {
        cust[i].display();
    }

    // To clean heap memory allocated by the objects -->
    delete ptr;
}
#include <iostream>
#include "Products.h"

int main()
{
    Products p1;
    p1.display();

    Products p2(102,888,"Laptop",400128,"Amravati");
    p2.display();
}
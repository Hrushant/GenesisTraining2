#include <iostream>
#include "Inventory.h"

int main()
{
    Inventory iObj1("Bag", 30, 201);
    iObj1.Sale(5);
    iObj1.Sale(4);
    iObj1.Purchase(10);
    iObj1.Sale(25);

    std::cout << "------------------------------------------------------------" << std::endl;

    Inventory iObj2("Furniture", 50, 201);
    iObj2.Purchase(10);
    iObj2.Sale(45);

    std::cout << "------------------------------------------------------------" << std::endl;

    Inventory iarr[3] = {{"Household", 100, 50111}, {"Electronics", 500, 50112}, {"Sports", 300, 50113}};
    search(iarr, 3, 50111);
    search(iarr, 3, 50118);

    std::cout << "------------------------------------------------------------" << std::endl;
}

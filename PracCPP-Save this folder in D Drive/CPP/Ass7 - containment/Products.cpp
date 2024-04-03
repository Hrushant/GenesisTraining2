#include "Products.h"

Products::Products(int pcode, int pr, string pnm, int pin, string cty)
    : deliveryAddress(pin, cty) // member initializer list
{
    productCode = pcode;
    price = pr;
    pname = pnm;
}

Products::Products()
{
    cout << "products() called.." << endl;
    productCode = 101;
    price = 999;
    pname = "bag";
}

void Products::display()
{
    cout << "------------------------------------------------------------------" << endl;
    cout << "Product code : " << productCode << endl;
    cout << "Price : " << price << endl;
    cout << "Product name : " << pname << endl;
    deliveryAddress.display(); // call display function of address class
    cout << "------------------------------------------------------------------" << endl;
}
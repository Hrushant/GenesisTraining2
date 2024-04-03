#include "Product.h"

Product::Product()
{
    name = "Bag";
    price = 990;
    id = 101;
}

Product::Product(string n, int p, int i)
{
    name = n;
    price = p;
    id = i;
}

Product::Product(string n, int p, int i,string cty, int pn) : proAddress(cty,pn)
{
    name = n;
    price = p;
    id = i;
}

void Product::display()
{
    cout << "-------------------------------" << endl;
    cout << "name : " << name << endl;
    cout << "price : " << price << endl;
    cout << "id : " << id << endl;
    proAddress.display();
    cout << "-------------------------------" << endl;
}

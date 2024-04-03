#include "product.h"
#include <cstring>

product::product()
{
    productCode = 11234;
    price = 600;
    strcpy(pname , "Bag");
}

product::product(int pCode, int pr, const char *name)
{
    productCode = pCode;
    price = pr;
    strcpy(pname,name);

}

void product::display()
{
    cout<<"Product Code : "<<productCode<<"Price : "<<price;
    cout<<"Product name : "<<pname;
}


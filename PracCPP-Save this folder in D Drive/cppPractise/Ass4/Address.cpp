#include "Address.h"

Address::Address()
{
    city = "Pune";
    pin = 411033;
}

Address::Address(std::string cty, int pn)
{
    city = cty;
    pin = pn;
}

void Address::display()
{
    cout << "city : " << city << endl;
    cout << "pin : " << pin << endl;
}

#include "Address.h"

Address::Address()
{
    pincode = 444705;
    city = "Pune";
    cout<<"Address() called..."<<endl;
}

Address::Address(int pin, string cty)
{
    pincode = pin;
    city = cty;
    cout<<"Address(int,string) called..."<<endl;
}

void Address::display()
{
    cout << "Pincode : " << pincode << endl;
    cout << "City : " << city << endl;
}

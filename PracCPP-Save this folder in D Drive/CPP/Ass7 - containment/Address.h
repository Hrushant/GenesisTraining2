#include <iostream>
using namespace std;

class Address
{
    int pincode;
    string city;

public:
    Address();
    Address(int, string);
    void display();

    int getPincode() const { return pincode; }
    void setPincode(int pincode_) { pincode = pincode_; }

    string getCity() const { return city; }
    void setCity(const string &city_) { city = city_; }
};
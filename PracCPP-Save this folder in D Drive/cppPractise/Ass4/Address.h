#include <iostream>
using namespace std;

class Address
{
    string city;
    int pin;

public:
    Address();
    Address(string, int);
    void display();
};
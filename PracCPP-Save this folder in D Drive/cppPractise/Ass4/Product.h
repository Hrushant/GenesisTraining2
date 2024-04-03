#include <iostream>
#include"Address.h"
using namespace std;

class Product
{
    string name;
    int price;
    int id;
    Address proAddress;
public:
    Product();
    Product(string, int, int);
    Product(string, int, int,string ,int);
    void display();
};
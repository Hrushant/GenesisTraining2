#include <iostream>
#include "Address.h"
using namespace std;

class Products // container class - class which holds obj of another class
{
    int productCode;
    int price;
    string pname;
    Address deliveryAddress; // contained obj of address class

public:
    Products(int,int,string,int,string);
    Products();
    void display();

    int getProductCode() const { return productCode; }
    void setProductCode(int productCode_) { productCode = productCode_; }

    int getPrice() const { return price; }
    void setPrice(int price_) { price = price_; }

    string getPname() const { return pname; }
    void setPname(const string &pname_) { pname = pname_; }

    Address getDeliveryAddress() const { return deliveryAddress; }
    void setDeliveryAddress(const Address &deliveryAddress_) { deliveryAddress = deliveryAddress_; }
};
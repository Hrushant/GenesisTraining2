#include<iostream>
using namespace std;

class product{
    int productCode;
    int price;
    char pname[20];

    public:
        product();                      //Function declaration
        product(int,int,const char *);  //Function declaration
        void display();                 //Function declaration

        // int getProductCode() const { return productCode; }
        // void setProductCode(int productCode_) { productCode = productCode_; }

        // int getPrice() const { return price; }
        // void setPrice(int price_) { price = price_; }
};


#ifndef INVENTORY_H
#define INVENTORY_H

#include <iostream>

class Inventory
{
    std::string description_of_product;
    int balance_stock;
    int product_code;

public:
    Inventory();
    Inventory(std::string, int, int);
    int Purchase(int);
    void Sale(int);
    void display();

    int getproductCode() const { return product_code; }
    void setProductCode(int productCode) { product_code = productCode; }

    int getbalanceStock() const { return balance_stock; }
    void setBalanceStock(int balanceStock) { balance_stock = balanceStock; }

    std::string getdescriptionOfProduct() const { return description_of_product; }
    void setDescriptionOfProduct(const std::string &descriptionOfProduct) { description_of_product = descriptionOfProduct; }
};

void search(Inventory[], int, int);
#endif // INVENTORY_H

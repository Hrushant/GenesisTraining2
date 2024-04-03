#include <iostream>
#include "Bill.h"
#include <string.h>

int main()
{
    Bill b[3];
    double totalAmount;

    for (int i = 0; i < 3; i++)
    {
        b[i].Accept();
        std::cout << b[i];
        totalAmount += b[i].getBillamount();
    }

    std::cout << "Total Bill Amount = " << totalAmount << std::endl;
    std::cout << "-----------------------------------------" << std::endl;

    char *custname;
    std::cout << "Enter Cust Name which details you want --> " << std::endl;
    std::cin >> custname;
    bool flag = false;

    for (int i = 0; i < 3; i++)
    {
        if (strcmp(b[i].getCustomerinfo().getCustomername(), custname) == 0)
        {
            std::cout << b[i] << std::endl;
            flag = true;
            break;
        }
    }
    if (flag == false)
    {
        std::cout << "Customer does not exists" << std::endl;
    }
}
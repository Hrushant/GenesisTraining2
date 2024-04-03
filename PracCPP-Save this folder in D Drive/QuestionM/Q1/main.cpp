#include <iostream>
#include "Customer.h"
#include "Bill.h"

int main()
{
    Bill b[3];
    double totalBill;
    for (int i = 0; i < 3; i++)
    {
        b[i].Accept();
        std::cout << b[i];
        totalBill += b[i].getBillamount();
    }

    std::cout << "-------------------------" << std::endl;
    std::cout << "Total Bill = " << totalBill << std::endl;

    char *custName;
    std::cout << "Enter Customer which details you want : " << std::endl;
    std::cin >> custName;
    bool flag = false;

    for (int i = 0; i < 3; i++)
    {
        if (strcmp(b[i].getCustomerinfo().getCustomername(), custName))
        {
            std::cout << b[i];
            flag = true;
            break;
        }
    }
    if (flag == false)
    {
        std::cout << "Customer not exists" << std::endl;
    }
}
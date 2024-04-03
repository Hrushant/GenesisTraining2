#include "Inventory.h"

Inventory::Inventory()
{
    description_of_product = "Garments";
    balance_stock = 30;
    product_code = 101;
}

Inventory::Inventory(std::string des_of_pro, int bal_sto, int pro_co)
{
    description_of_product = des_of_pro;
    balance_stock = bal_sto;
    if (balance_stock <= 20)
    {
        throw std::runtime_error("Not valid input, It must be greater than 20");
    }
    product_code = pro_co;
}

int Inventory::Purchase(int pro_quantity)
{
    balance_stock = pro_quantity + balance_stock;
    std::cout << "Total_stock = " << balance_stock << std::endl;
    return balance_stock;
}

void Inventory ::Sale(int solved_stock)
{
    try
    {
        int current_stock = balance_stock;
        std::cout << "Current stocks : " << current_stock << std::endl;
        balance_stock = balance_stock - solved_stock;
        if (balance_stock < 20)
        {
            throw std::runtime_error("Exception : Low Stock Level");
        }

        std::cout << "After selling stocks, current stocks : " << balance_stock << std::endl;
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }
}

void Inventory::display()
{
    std::cout << "description_of_product : " << description_of_product << std::endl;
    std::cout << "Balance stock : " << balance_stock << std::endl;
    std::cout << "Product code : " << product_code << std::endl;
}

void search(Inventory iar[], int bal_sto, int pro_co)
{
    try
    {
        bool flag = false;
        for (int i = 0; i < 3; i++)
        {
            for (int i = 0; i < 3; i++)
            {
                if (iar[i].getproductCode() == pro_co)
                {
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false)
        {
            throw std::runtime_error("Product Not Found");
        }
        else
        {
            std::cout << "Product Found " << std::endl;
        }
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }
}

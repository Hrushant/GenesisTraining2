#include "Bill.h"

Bill::Bill()
{
    billnumber = 101;
    billamount = 100000;
    // customerinfo;
    // billdate;
}

void Bill::Accept()
{
    std::cout << "Enter billnumber : " << std::endl;
    std::cin >> billnumber;
    std::cout << "Enter billamount : " << std::endl;
    std::cin >> billamount;
    std::cout << "Customer's information --> " << std::endl;
    customerinfo.Accept();
    std::cout << "Bill Date Information --> " << std::endl;
    billdate.Accept();
}

Bill::~Bill()
{
    std::cout << "~Bill() called... " << std::endl;
}

std::ostream &operator<<(std::ostream &os, const Bill &b)
{
    std::cout << "-----------------------------------------------" << std::endl;
    os << "Bill Number : " << b.billnumber << std::endl;
    os << "Bill amount : " << b.billamount << std::endl;
    os << b.customerinfo << std::endl;
    os << b.billdate << std::endl;
    std::cout << "-----------------------------------------------" << std::endl;

    return os;
}

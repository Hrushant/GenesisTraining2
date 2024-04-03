#include "Bill.h"

Bill::Bill()
{
    billnumber = 101;
    billamount = 9000;
    // customerinfo;
    // billdate;
}

void Bill::Accept()
{
    std::cout << "Enter Bill number : " << std::endl;
    std::cin >> billnumber;
    std::cout << "Enter Bill amount : " << std::endl;
    std::cin >> billamount;
    std::cout << "Customer's information : " << std::endl;
    customerinfo.Accept();
    std::cout << "Date/Month/Year : " << std::endl;
    billdate.Accept();
}

Bill::~Bill()
{
    std::cout << "~Bill() called..." << std::endl;
}

std::ostream &operator<<(std::ostream &os, const Bill &b)
{
    std::cout << "------------------------" << std::endl;
    os << "Bill Amount : " << b.billamount << std::endl;
    os << "Bill Number : " << b.billnumber << std::endl;
    os << b.customerinfo << std::endl;
    os << b.billdate << std::endl;
    ;
    return os;
}

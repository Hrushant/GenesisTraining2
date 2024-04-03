#include "salesperson.h"

Salesperson::Salesperson() : salesamount(100000), commissionrate(0.05)
{
    std::cout << "Salesperson() called..." << std::endl;
}

Salesperson::Salesperson(int eid, std::string ename, double esal, double samt, double crate)
    : Emp(eid, ename, esal) // Employee parameterised constructor
      , salesamount(samt), commissionrate(crate)
{
    std::cout << "Salesperson(...) called..." << std::endl;
}

void Salesperson::display()
{
    std::cout << "--------------------------------------------------" << std::endl;
    Emp ::display(); // for displaying employee details
    std::cout << "SalesAmount : " << salesamount << std::endl;
    std::cout << "Commisionrate : " << commissionrate << std::endl;
    std::cout << "---------------------------------------------------" << std::endl;
}

Salesperson::~Salesperson()
{
    std::cout << "~Salesperson() called..." << std::endl;
}

double Salesperson::calTotalSalary()
{
    return Emp::calTotalSalary() + salesamount * commissionrate;
}

double Salesperson::calCommision()
{
    return salesamount * commissionrate;
}

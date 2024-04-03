#include "manager.h"

Manager::Manager()
{
    number_subordinates = 50;
    incentives_persub = 3000;
    std::cout << "Manager() called..." << std::endl;
}

Manager::~Manager()
{
    std::cout << "~Manager() called..." << std::endl;
}

Manager::Manager(int n_s, double i_ps)
{
    number_subordinates = n_s;
    incentives_persub = i_ps;
    std::cout << "Manager(....) called..." << std::endl;
}

Manager::Manager(int eid, std::string ename, double esal, int n_s, double i_ps)
    : Emp(eid, ename, esal), number_subordinates(n_s), incentives_persub(i_ps)
{
    std::cout << "Manager(.........) called..." << std::endl;
}

void Manager::display()
{
    Emp ::display();
    std::cout << "number_subordinates : " << number_subordinates << std::endl;
    std::cout << "incentives_persub : " << incentives_persub << std::endl;
}

double Manager::calTotalSalary()
{
    return Emp::calTotalSalary() + number_subordinates * incentives_persub;
}

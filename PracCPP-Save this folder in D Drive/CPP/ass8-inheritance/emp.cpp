#include "emp.h"

Emp::Emp() : empid(101), ename("Jay"), esalary(25000) // public function
{
    std::cout << "Emp() called.." << std::endl;
    calAllownces();
}

Emp::Emp(int eid, std::string enm, double esal) : empid(eid), ename(enm), esalary(esal)
{
    std::cout << "Emp(.....) called.." << std::endl;
    calAllownces();
}

Emp::~Emp() // destructors always called in the reverse order
{
    std::cout << "~Emp() called..." << std::endl;
}

double Emp::calTotalSalary()
{
    return esalary - HRA - MA - Ptax - pf;
}

void Emp::display()
{
    std::cout << "Id : " << empid << std::endl;
    std::cout << "Name : " << ename << std::endl;
    std::cout << "Salary : " << esalary << std::endl;
}

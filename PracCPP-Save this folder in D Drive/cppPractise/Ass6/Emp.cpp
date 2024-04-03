#include "Emp.h"

Emp::Emp()
{
    empid = 101;
    ename = "Abhishek";
    esalary = 50000;
}

Emp::Emp(int eid, string enm, double esal)
{
    empid = eid;
    ename = enm;
    esalary = esal;
}

void Emp::display()
{
    cout << "Emp id : " << empid << endl;
    cout << "Emp name : " << ename << endl;
    cout << "Emp salary : " << esalary << endl;
}

Emp::~Emp()
{
    cout << "~Emp () called ..." << endl;
}

double Emp::calTotalSal()
{
    return esalary - HRA - MA - Ptax - pf;
}

#ifndef EMP_H
#define EMP_H

#include <iostream>
#include <string>
using namespace std;

class Emp
{
    int empid;
    string ename;
    double esalary;
    double HRA,MA,Ptax,pf;
    void calAllowances(){
        HRA = esalary * 0.03;
        MA = esalary * 0.04;
        Ptax = esalary * 0.02;
        pf = esalary * 0.02;
    }

public:
    Emp();
    Emp(int, string, double);
    virtual void display();
    ~Emp();
    virtual double calTotalSal();
};

#endif // EMP_H

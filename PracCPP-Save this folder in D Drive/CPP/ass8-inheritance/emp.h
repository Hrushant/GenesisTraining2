// header guard  --> ctrl+shift+p --> c-mantic - add header guard
#ifndef EMP_H
#define EMP_H

#include <iostream>

class Emp
{
    int empid;
    std::string ename;
    double esalary;
    double HRA, MA, Ptax, pf;
    void calAllownces() // private function - helper functions - they help public function
    {
        HRA = esalary * 0.02;
        MA = esalary * 0.03;
        Ptax = esalary * 0.05;
        pf = esalary * 0.02;
    }

public:
    Emp();
    Emp(int, std::string, double);
    virtual ~Emp();        //use virtual keyword only hera i.e only in base class
    virtual double calTotalSalary();
    virtual void display();
};

#endif // EMP_H

/*

vfptr (virtual function pointer) is created everytime in same table.
whenever basefunction class is marked as virtual
- virtual function pointer is added to each object in hierarchy.
- vfptr points to vftable [vftable is an array which holds addressess of virtual functions of respective class].
- vfptr is created per object
    --> vfptr is initializes with base address of vftable inside constructor.
- vftable is created per class.

** make only base class function as virtual.

--we have to make base class destructor as virtual.
--we can not make constructor virtual.
*/

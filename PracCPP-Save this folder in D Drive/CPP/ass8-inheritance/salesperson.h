#include "emp.h"

class Salesperson : public Emp
{
    double salesamount, commissionrate;

public:
    Salesperson();
    Salesperson(int,std::string,double,double,double);
    ~Salesperson();
    void display();
    double calTotalSalary();  //it is override bcoz of same name method in derived class

    // to calculate commisionAmount = salesamount * commisionrate;
    double calCommision();
};

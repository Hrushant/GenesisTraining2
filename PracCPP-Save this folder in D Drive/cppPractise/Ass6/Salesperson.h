#include <iostream>
#include "Emp.h"
using namespace std;

class Salesperson : public Emp
{
    double salesamount;
    double commisionrate;

public:
    Salesperson();
    Salesperson(int, string, double, double, double);
    void display();
    ~Salesperson();
    double calTotalSal();
    double calCommision();
};
#include <iostream>
#include "emp.h"

class Manager : public Emp
{
    int number_subordinates;
    double incentives_persub;

public:
    Manager();
    ~Manager();
    Manager(int, double);
    Manager(int, std::string, double, int, double);
    void display();
    double calTotalSalary();
};

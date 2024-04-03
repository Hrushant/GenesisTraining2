#include "Salesperson.h"
using namespace std;

Salesperson::Salesperson()
{
    salesamount = 1000;
    commisionrate = 0.05;
}

Salesperson::Salesperson(int eid, string enm, double esal, double sa, double cr)
    : Emp(eid, enm, esal), salesamount(sa), commisionrate(cr)
{
}

void Salesperson::display()
{
    Emp::display();
    cout << "SalesAmount : " << salesamount << endl;
    cout << "CommisionRate : " << commisionrate << endl;
}

Salesperson::~Salesperson()
{
    cout << "~Salesperson() called..." << endl;
}

double Salesperson::calTotalSal()
{
    return Emp::calTotalSal() + salesamount * commisionrate;
}

double Salesperson::calCommision()
{
    return salesamount * commisionrate;
}

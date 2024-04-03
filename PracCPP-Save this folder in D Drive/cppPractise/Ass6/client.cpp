#include <iostream>
#include "Salesperson.h"
using namespace std;

int main()
{
    // Salesperson s1;
    // s1.display();
    // cout<<"calTotalSal : "<<s1.calTotalSal()<<endl;
    // cout<<"calCommision : "<<s1.calCommision()<<endl;

    // Salesperson s2(201, "Hrush", 70000, 100000, 0.05);
    // s2.display();
    // cout << "calTotalSal : " << s2.calTotalSal() << endl;
    // cout << "calCommision : " << s2.calCommision() << endl;

    Emp *eptr = new Salesperson();
    eptr->display();
    cout << "Total sal : " << eptr->calTotalSal() << endl;
    Salesperson *sp = dynamic_cast<Salesperson *>(eptr); // type cast
    cout << "calCommision : " << sp->calCommision() << endl;
    delete eptr;
}
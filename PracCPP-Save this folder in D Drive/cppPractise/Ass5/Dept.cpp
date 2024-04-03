#include "Dept.h"

Dept::Dept()
{
    id = 901;
    dname = "IT";
}

Dept::Dept(int i, string n)
{
    id = i;
    dname = n;
}

Dept::Dept(int i, string n, int roll, string nm) : ds(roll, nm)
{
    id = i;
    dname = n;
}

void Dept::display()
{
    cout << "--------------------------" << endl;
    cout << "id : " << id << endl;
    cout << "dname : " << dname << endl;
    ds.display();
    cout << "---------------------------" << endl;
}

#include "Stu.h"

Stu::Stu()
{
    rollNo = 21;
    name = "Abhi";
}

Stu::Stu(int roll, string nm)
{
    rollNo = roll;
    name = nm;
}

void Stu::display()
{
    cout << "RollNo : " << rollNo << endl;
    cout << "Name : " << name << endl;
}

#include "Student.h"
#include <cstring>
using namespace std;

Student::Student()
{
    rollNo = 11;
    strcpy(sName, "Harsh");
    mark = 99;
}

Student::Student(int rNo, const char *sNm, int m)
{
    rollNo = rNo;
    strcpy(sName, sNm);
    mark = m;
}

void Student::display()
{
    cout << "Student Roll Number : " << rollNo << "\n";
    cout << "Student Name : " << sName << "\n";
    cout << "Student mark : " << mark << "\n";
}

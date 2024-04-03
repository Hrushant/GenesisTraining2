#include <iostream>
#include <cstring>
using namespace std;

class Student
{
    char *sname;

public:
    Student()
    {
        strcpy(sname, "Ram");
    }
    Student(const char *name)
    {
        sname = new char[20];
        strcpy(sname, name);
    }
    bool operator==(Student &ss)
    {
        return strcmp(sname, ss.sname);
    }
};

int main()
{
    Student s1("Rahul");
    Student s2("Kishan");
    if (s1 == s2)   //bcoz strcmp compares asscii values
    {
        cout << "Not Same " << endl;
    }
    else
    {
        cout << "Same " << endl;
    }

    return 0;
}
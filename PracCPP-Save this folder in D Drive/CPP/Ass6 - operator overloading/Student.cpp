#include <iostream>
#include <cstring>
using namespace std;

class Student
{
    char sname[20];

public:
    Student()
    {
        strcpy(sname, "Radha");
    }
    Student(const char *name)
    {
        strcpy(sname, name);
    }
    void show()
    {
        cout << "Name : " << sname << endl;
    }

    char operator[](int index) // for printing the charactor on given index
    {
        if (!(index >= 0 && index < strlen(sname)))
            throw "Index out of range";

        return sname[index];
    }
};

int main()
{
    Student s1("Hrushant");
    try
    {
        char ch = s1[12];
        cout << "ch : " << ch << endl;
    }
    catch (const char *msg)
    {
        cout << msg;
    }

    return 0;
}
#include <iostream>
#include <cstring>
using namespace std;

class student
{
    int id;
    char name[20];

public:
    student()
    {
        id = 101;
        strcpy(name, "Ram");
    }
    student(int idd, const char *nm)
    {
        id = idd;
        strcpy(name, nm);
    }
    void display()
    {
        cout << "Id : " << id << endl;
        cout << "Name : " << name << endl;
    }

    char operator[](int i)
    {
        if ((i < 0 || i > strlen(name)))
            throw "Index out";

        return name[i];
    }
};

int main()
{
    student s1;
    s1.display();

    student s2(201, "Abhi");
    s2.display();

    try
    {
        cout << s2[020] << endl;
    }
    catch (const char *msg)
    {
        cout << msg << endl;
    }
}
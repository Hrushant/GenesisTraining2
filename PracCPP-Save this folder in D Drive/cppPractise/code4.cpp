#include <iostream>
#include <cstring>
using namespace std;

class Cust
{
    int id;
    char *sname;

public:
    Cust()
    {
        id = 101;
        sname = new char[20];
        strcpy(sname, "Ram");
    }
    Cust(int i, const char *nm)
    {
        id = i;
        sname = new char[strlen(nm) + 1];
        strcpy(sname, nm);
    }
    void display()
    {
        cout << "id = " << id << endl;
        cout << "sname = " << sname << endl;
    }

    bool operator==(Cust &cc)
    {
        return id == cc.id;
    }
};

int main()
{
    Cust c1(101, "Hrushant");
    c1.display();

    Cust c2(103, "Hrushant");
    c2.display();

    Cust c3;
    c3.display();

    if (c1 == c2)
    {
        cout << "Same" << endl;
    }
    else
    {
        cout << "Not same" << endl;
    }
}
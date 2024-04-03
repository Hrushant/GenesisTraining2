#include <iostream>
#include <cstring>
using namespace std;

class Prod
{
    char name[20];
    int marks[3];

public:
    Prod()
    {
        strcpy(name, "Ram");
        marks[0] = 100;
        marks[1] = 99;
        marks[2] = 80;
    }
    Prod(const char *nm, int *mk)
    {
        strcpy(name, nm);
        for (int i = 0; i < 3; i++)
        {
            marks[i] = mk[i];
        }
    }
    float calAvg()
    {
        float sum = 0;
        for (int i = 0; i < 3; i++)
        {
            sum += marks[i];
        }
        return sum / 3.0;
    }
    bool operator==(Prod &p)
    {
        return calAvg() == p.calAvg();
    }
    bool operator<(Prod &p)
    {
        return calAvg() < p.calAvg();
    }

    int operator[](int i){
        return marks[i];
    }
};

int main()
{
    int m1[3] = {99, 89, 79};
    Prod p1("Hrush", m1);

    int m2[3] = {10,20,30};
    Prod p2("Krish", m2);

    float avg1 = p1.calAvg();
    float avg2 = p2.calAvg();

    cout << avg1 << " " << avg2 << endl;

    if (p1 == p2)
    {
        cout << "p1 == p2" << endl;
    }
    else if (p1 < p2)
    {
        cout << "p1 < p2" << endl;
    }
    else
    {
        cout << "p1 > p2" << endl;
    }

    cout<<p1[2]<<endl;
}
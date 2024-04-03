#include <iostream>
#include <cstring>
using namespace std;

class student1
{
    char name[20];
    int marks[3];

public:
    student1()
    {
        strcpy(name, "Hrush");
        marks[0] = 99;
        marks[1] = 89;
        marks[2] = 79;
    }
    student1(const char *nm, int *mk)
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
            sum = sum + marks[i];
        }
        return sum / 3.0;
    }

    bool operator==(student1 &p1)
    {
        return calAvg() == p1.calAvg();
    }
    
    bool operator<(student1 &ss)
    {
        return calAvg() < ss.calAvg();
    }
};

int main()
{
    int m1[3] = {100, 100, 99};
    student1 s1("Hr", m1);

    int m2[3] = {100, 100, 99};
    student1 s2("Hr", m2);

    float avg1 = s1.calAvg();
    float avg2 = s2.calAvg();

    cout << avg1 << " " << avg2 << endl;

    if (s1 == s2)
    {
        cout << "s1 == s2" << endl;
    }
    else if (s1 < s2)
    {
        cout << "s1 < s2" << endl;
    }
    else
    {
        cout << "s1 > s2" << endl;
    }
}

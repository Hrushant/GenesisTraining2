#include <iostream>
#include <cstring>
using namespace std;

class Student
{
    char sname[20];
    int marks[3];

public:
    Student()
    {
        strcpy(sname, "Radha");
        marks[0] = 80;
        marks[1] = 90;
        marks[2] = 70;
    }
    Student(const char *name, int *mk)
    {
        strcpy(sname, name);
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
    int operator[](int index)
    {
        return marks[index];
    }

    bool operator==(Student &p2)
    {
        return calAvg() == p2.calAvg();
    }

    bool operator<(Student &p2)
    {
        return calAvg() < p2.calAvg();
    }
};

int main()
{
    int marr[3] = {77, 82, 99};
    Student s1("Yash", marr);

    int marr1[3] = {77, 82, 99};
    Student s2("Ram", marr1);

    cout << "---------------------------------" << endl;

    float avg = s1.calAvg();
    cout << "Avg 1 : " << avg << endl;

    float avg1 = s2.calAvg();
    cout << "Avg 2 : " << avg1 << endl;

    cout << "---------------------------------" << endl;

    int mk = s1[1];
    cout << "mk : " << mk << endl;

    cout << "---------------------------------" << endl;

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

    cout << "---------------------------------" << endl;
}
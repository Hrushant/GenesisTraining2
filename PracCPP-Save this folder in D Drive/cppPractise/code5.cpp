#include <iostream>
#include <iomanip>
using namespace std;

void add(int a, int b)
{
    cout << "a + b = " << a + b << endl;
}

void add(float a, float b)
{
    cout << "a + b = " << a + b << endl;
}

void add(double a, double b)
{
    cout << setprecision(15); // for digits after point
    cout << "a + b = " << a + b << endl;
}

void sub(int a, int b = 5)
{
    cout << "a - b = " << a - b << endl;
}

int main()
{
    add(10, 20);
    add(10.555555555555, 10.3333333333333);
    add(70.5f, 80.6f);
    sub(10, 9);
    sub(20);
}
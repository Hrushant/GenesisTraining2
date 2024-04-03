#include <iostream>
#include <iomanip> //setting precision
using namespace std;

// Function overloading --> Multiple functions with same name but different parameters

void add(int a, int b)
{
    cout << "a + b = " << a + b << endl;
}
// void add(float a, float b)
// {
//     cout << "a + b = " << a + b << endl;
// }
void add(double a, double b)
{
    cout << setprecision(15);  //for digits after point
    cout << "a + b = " << a + b << endl;
}
void add(int a, int b, int c)
{
    cout << "a + b + c = " << a + b + c << endl;
}
void sub(int x, int y = 100, int z = 50)   //if you want to assign default values then assign from right to left side otherwise it gives error.
{
    cout << "x - y - z = " << x - y - z << endl;
}

int main()
{
    add(10, 20);
    add(10, 20, 30);
    add(10.5, 20.5);
    add(10.9f, 89.6f);
    sub(100, 50);
}
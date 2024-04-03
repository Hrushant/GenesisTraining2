#include <iostream>
using namespace std;

void fun()
{
    cout << "Enter number :";
    int n;
    cin >> n;
    if (n < 10)
    {
        throw runtime_error("Number is less than 10");
    }
    cout << n << endl;
}

int main()
{
    try
    {
        cout << "Indide try..." << endl;
        fun();
    }
    catch (runtime_error e)
    {
        cout << "Error" << endl;
        std::cerr << e.what() << '\n';
    }
}
#include <iostream>
using namespace std;

/*
ostream class :
    cout is an obj of ostream class
    It can use this obj for o/p functionality
    <<  --> insertion/left shift operator

    eg:
        cout<<"Hello";

istream class :
    cin is an obj of istream class
    It can use this obj for i/p functionality
    >> --> extraction operator

    eg:
        cout<<"Enter the number : ";
        cin>>num;
*/
int main()
{
    int n1, n2;
    cout << "Enter the numbers : ";
    cin >> n1 >> n2;
    if (n1 > n2)
    {
        cout << n1 << " is greater";
    }
    else
    {
        cout << n2 << " is greater";
    }

    for (int i = 1; i < 10; i++)
    {
        cout << i << "\n";
    }

    int choice = 2;
    switch (choice)
    {
    case 1:
        cout << "In case 1";
        break;
    case 2:
        cout << "In case 2";
        break;
    case 3:
        cout << "In case 3";
        break;
    default:
        cout << "Wrong choice";
    }
    return 0;
}

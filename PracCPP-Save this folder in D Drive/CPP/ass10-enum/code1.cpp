#include <iostream>
using namespace std;

enum carType
{
    SEDAN = 100,
    MARUTI = 200,
    HONDA = 300
};

int main()
{
    cout << carType::HONDA << endl;
    carType c1 = SEDAN;
    cout << c1 << endl;

    int c;
    carType cType;
    cin >> c;
    cType = (carType)c;
    cout<<cType<<endl;
}
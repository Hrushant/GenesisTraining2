#include <iostream>
using namespace std;

void pr(const int &k) // bcoz of const we can't change value of k
{
    // k = 90;
    cout << k;
}

int main()
{
    int a = 10;
    pr(a); // pass by reference

    return 0;
}

#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    int arr[5] = {11, 12, 13, 14, 15};
    int *p = arr;

    cout << "1st element : " << *p << "\n";
    p++;
    cout << "2nd element : " << *p << "\n";
    p++;
    cout << "3rd element : " << *p << "\n";
    p++;
    cout << "4th element : " << *p << "\n";
    p++;
    cout << "5th element : " << *p << "\n";
    p--;
    cout << "4th element : " << *p << "\n";

    char str[20] = {"KPIT"};
    char str1[20] = {'K', 'P', 'I', 'T'};

    cout << str[2] << "\n";
    cout << str1[1] << "\n";

    int len = strlen(str);
    cout << len << "\n";
    cout << sizeof(str) << '\n';

    strcpy(str, str1); // dest,source
    cout << str << "\n";
    return 0;
}
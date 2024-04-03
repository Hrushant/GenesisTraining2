#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    int arr[3] = {11, 22, 33};
    int *p = arr;
    cout << *p << endl;
    p++;
    cout << *p << endl;

    char str1[10] = {"KPIT"};
    char str2[5] = {'K', 'P', 'I', 'T'};
    cout << str1[2] << endl;
    cout << strlen(str1) << endl;
    cout << strlen(str2) << endl;
    cout << sizeof(str1) << endl;
    cout << sizeof(str2) << endl;
}
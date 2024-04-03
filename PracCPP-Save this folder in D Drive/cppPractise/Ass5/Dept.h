#include <iostream>
#include "Stu.h"
using namespace std;

class Dept
{
    int id;
    string dname;
    Stu ds;

public:
    Dept();
    Dept(int, string);
    void display();

    Dept(int, string , int, string);
};
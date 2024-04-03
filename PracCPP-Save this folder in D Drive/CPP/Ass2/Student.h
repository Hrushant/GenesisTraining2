#include <iostream>
#include <cstring>

class Student
{
    int rollNo;
    char sName[20];
    int mark;

public:
    Student();
    Student(int, const char *, int);
    void display();

    int getRollNo() const { return rollNo; }
    void setRollNo(int rollNo_) { rollNo = rollNo_; }
};
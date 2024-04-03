#ifndef DATE_H
#define DATE_H

#include <iostream>

class Date
{
    int day;
    int month;
    int year;
    static int monthsperyear;

public:
    Date();
    Date(int, int, int);
    int checkDay(int);
    void Print();
    bool isLeapYear(int);
};

#endif // DATE_H

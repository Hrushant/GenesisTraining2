#ifndef DATE_H
#define DATE_H

#include <iostream>

class Date
{
    int day;
    int month;
    int year;

public:
    Date();
    Date(int, int, int);
    void display();
    void Accept();
    friend std::ostream &operator<<(std::ostream &os , const Date &d);

    int getDay() const { return day; }
    void setDay(int day_) { day = day_; }

    int getMonth() const { return month; }
    void setMonth(int month_) { month = month_; }

    int getYear() const { return year; }
    void setYear(int year_) { year = year_; }
};

#endif // DATE_H

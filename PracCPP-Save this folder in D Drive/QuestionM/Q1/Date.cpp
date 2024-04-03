#include "Date.h"

Date::Date()
{
    day = 29;
    month = 6;
    year = 2001;
}

Date::Date(int d, int m, int y)
{
    day = d;
    month = m;
    year = y;
}

void Date::display()
{
    std::cout << "Day : " << day << std::endl;
    std::cout << "Month : " << month << std::endl;
    std::cout << "Year : " << year << std::endl;
}

void Date::Accept()
{
    std::cout << "Enter Month : " << std::endl;
    std::cin >> month;

    if (month > 0 && month <= 12)
    {
        if (month == 2)
        {
            std::cin >> day;
            if (day < 0 && day > 28)
            {
                std::cout << "Not valid input for Day in february" << std::endl;
            }
        }
        else if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)
        {
            if (day > 0 && day <= 31)
            {
                std::cout << "Enter Day : " << std::endl;
                std::cin >> day;
            }
            else
            {
                std::cout << "Not valid input for Day" << std::endl;
            }
        }
        else
        {
            if (day > 0 && day <= 30)
            {
                std::cout << "Enter Day : " << std::endl;
                std::cin >> day;
            }
            else
            {
                std::cout << "Not valid input for Day" << std::endl;
            }
        }
    }
    else
    {
        std::cout << "Not valid input for Month " << std::endl;
    }

    std::cout << "Enter Year : " << std::endl;
    std::cin >> year;
}

std::ostream &operator<<(std::ostream &os, const Date &d)
{
    os << "Date : " << d.day << " / " << d.month << " / " << d.year;
    return os;
}

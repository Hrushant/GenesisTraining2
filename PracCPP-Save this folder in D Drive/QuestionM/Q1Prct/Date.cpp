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

void Date::Accept()
{

    std::cout << "Enter Month : " << std::endl;
    std::cin >> month;
    if (month > 0 && month <= 12)
    {
        if (month == 2)
        {
            std::cout << "Enter Day : " << std::endl;
            std::cin >> day;
            if (day < 0 || day > 28)
            {
                std::cout << "Invalid day value it should be between 1 to 28" << std::endl;
            }
        }
        else if (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)
        {
            std::cout << "Enter Day : " << std::endl;
            std::cin >> day;
            if (day < 0 || day > 31)
            {
                std::cout << "Invalid day value it should be between 1 to 31" << std::endl;
            }
        }
        else
        {
            std::cout << "Enter Day : " << std::endl;
            std::cin >> day;
            if (day < 0 || day > 30)
            {
                std::cout << "Invalid day value it should be between 1 to 30" << std::endl;
            }
        }
    }
    else
    {
        std::cout << "Invalid month value it should be between 1 to 12" << std::endl;
    }
    std::cout << "Enter Year : " << std::endl;
    std::cin >> year;
}

std::ostream &operator<<(std::ostream &os, const Date &d)
{
    os << "Date --> " << d.day << " / " << d.month << " / " << d.year << std::endl;
    return os;
}

#include "Date.h"

Date::Date()
{
    day = 0;
    month = 0;
    year = 0;
}

Date::Date(int d, int m, int y)
{
    day = d;
    month = m;
    year = y;
}

int Date::monthsperyear = 12;
int Date::checkDay(int testday)
{
    const int daysPerMonth[monthsperyear + 1] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    try
    {
        if (isLeapYear(year) && month == 2)
        {
            if (testday <= 29 && testday >= 1)
            {
                std::cout << "LEAP YEAR " << std::endl;
                std::cout << "Testday is correct" << std::endl;
            }
            else
            {
                throw std::runtime_error("NOT A LEAP YEAR");
            }
        }
        else
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                if (daysPerMonth[1] >= testday && testday > 0)
                {
                    std::cout << "Days in month --> " << daysPerMonth[1] << std::endl;
                    std::cout << "Testday is correct" << std::endl;
                }
                else
                {
                    throw std::runtime_error("NOT VALID testday");
                }
            }
            else if (month == 2)
            {
                if (testday <= 28 && testday >= 1)
                {
                    std::cout << "Days in month --> " << daysPerMonth[2] << std::endl;
                    std::cout << "Testday is correct" << std::endl;
                }
                else
                {
                    throw std::runtime_error("NOT VALID testday");
                }
            }
            else
            {
                if (testday <= 30 && testday >= 1)
                {
                    std::cout << "Days in month --> " << daysPerMonth[4] << std::endl;
                    std::cout << "Testday is correct" << std::endl;
                }
                else
                {
                    throw std::runtime_error("NOT VALID testday");
                }
            }
        }
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }
}

void Date::Print()
{
    checkDay(day);
}

bool Date::isLeapYear(int y)
{
    if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

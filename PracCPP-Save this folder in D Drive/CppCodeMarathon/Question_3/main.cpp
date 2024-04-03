#include <iostream>
#include "Exam.h"

int main()
{
    std::cout << "--------------------------------------" << std::endl;

    Exam e1(102, ONLINE, 28, 2, 2005);
    e1.display();

    std::cout << "--------------------------------------" << std::endl;

    Exam e2(103, OFFLINE, 34, 2, 2005);
    e2.display();

    std::cout << "--------------------------------------" << std::endl;
}
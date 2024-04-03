#include <iostream>

int main()
{
    int n1, n2;
    std::cout << "Enter two numbers : " << std::endl;
    std::cin >> n1 >> n2;

    if (n1 < n2)
    {
        std::cout << "n1 < n2" << std::endl;
    }
    else if (n1 > n2)
    {
        std::cout << "n1 > n2" << std::endl;
    }
    else
    {
        std::cout << "n1 == n2" << std::endl;
    }

    int n;
    std::cout << "Enter number : " << std::endl;
    std::cin >> n;
    switch (n)
    {
    case 1:
        std::cout << "one";
        break;
    case 2:
        std::cout << "two";
        break;
    case 3:
        std::cout << "three";
        break;

    default:
        std::cout << "Default it is zero";
        break;
    }

    return 0;
}
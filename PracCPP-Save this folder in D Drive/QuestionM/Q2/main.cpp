#include <iostream>
#include "Vehicle.h"
#include "Car.h"
using namespace std;

int main()
{
    Vehicle *v[3];

    for (int i = 0; i < 3; i++)
    {
        v[i] = new Car;
        v[i]->Accept();
    }
    for (int i = 0; i < 3; i++)
    {
        v[i]->display();
    }

    // ----- display details based on chassis no
    std::string cno;
    std::cout << "Enter chassis no:" << std::endl;
    std::cin >> cno;
    for (int i = 0; i < 3; i++)
    {
        if (v[i]->getchassisNo() == cno)
        {
            v[i]->display();
            break;
        }
    }

    std::cout << "Enter a category 0-SUV 1-HATCHBACK 2-SEDAN:" << std::endl;
    int cat;
    std::cin >> cat;
    int countCat = 0;
    // since v is of type vehicle pointer.... to call getCarCategory we need to cast vehicle to car
    Car *car;
    for (int i = 0; i < 3; i++)
    {
        car = dynamic_cast<Car *>(v[i]);
        if (car == 0)
        {
            std::cout << "Casting failed..." << std::endl;
            break;
        }
        if (car->getCarCategory() == (CarCategory)cat)
        {
            countCat++;
        }
    }

    std::cout << cat << " Category count: " << countCat << std::endl;

    // -------------------------------

    double avgPrice = 0;
    for (int i = 0; i < 3; i++)
    {
        car = dynamic_cast<Car *>(v[i]);
        if (car == 0)
        {
            std::cout << "Casting failed..." << std::endl;
            break;
        }
        if (car->getCarCategory() == (CarCategory)cat)
        {
            avgPrice += car->getexShowroomPrice();
        }
    }
    std::cout << "Average price of cars in " << cat << " category is: " << avgPrice / countCat << std::endl;

    return 0;
}

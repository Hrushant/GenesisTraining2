#include <iostream>
#include "Vehicle.h"
#include "Car.h"

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
        cout<<"--------------------------------------------------"<<endl;
    }

    cout << "--------------------------------------------------" << endl;
    cout << "--------------------------------------------------" << endl;
    cout << "Enter Chassis Number : " << endl;
    string chassis_number;
    cin >> chassis_number;
    for (int i = 0; i < 3; i++)
    {
        if (v[i]->getchassisNo() == chassis_number)
        {
            v[i]->display();
            break;
        }
    }

    cout << "--------------------------------------------------" << endl;
    cout << "--------------------------------------------------" << endl;

    std::cout << "Enter a category 0-SUV 1-HATCHBACK 2-SEDAN:" << std::endl;
    int cat;
    cin >> cat;
    int carCnt = 0;
    Car *car;
    for (int i = 0; i < 3; i++)
    {
        car = dynamic_cast<Car *>(v[i]);
        if (car == 0)
        {
            std::cout << "Casting failed..." << std::endl;
            break;
        }
        if (car->getCarCategoryObj() == (CarCategory)cat)
        {
            carCnt++;
        }
    }
    std::cout << cat << " Category count: " << carCnt << std::endl;

    cout << "--------------------------------------------------" << endl;
    cout << "--------------------------------------------------" << endl;
}
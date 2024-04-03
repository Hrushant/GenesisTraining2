#include "Car.h"

Car::Car()
{
    carCategory = CarCategory ::SEDAN;
}

Car::Car(CarCategory cCat, string chassis_n, string vehicle_b, double insurance_a, double t, double ex_showroom_pr, int no_of_s)
    : carCategory(cCat), Vehicle(chassis_n, vehicle_b, insurance_a, t, ex_showroom_pr, no_of_s)
{
}

Car::~Car()
{
    std::cout << "~Car() called..." << std::endl;
}

void Car::display()
{
    Vehicle::display();

    cout << "Car CAtegories --> " << endl;
    switch (carCategory)
    {
    case CarCategory::SEDAN:
        cout << "SEDAN" << endl;
        break;

    case CarCategory::HATCHBACK:
        cout << "HATCHBACK" << endl;
        break;

    case CarCategory::SUV:
        cout << "SUV" << endl;
        break;

    default:
        break;
    }
}

void Car::Accept()
{
    // Vehicle::display();
    std::cout<<"Enter car category : "<<endl;
    int cat;
    std::cin>>cat;
    carCategory = (CarCategory)cat;
    Vehicle::Accept();
}

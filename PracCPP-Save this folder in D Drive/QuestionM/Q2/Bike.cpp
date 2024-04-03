#include "Bike.h"

Bike::Bike()
{
    bikeCategory = BikeCategory ::OFFROADER;
}

Bike::Bike(BikeCategory bCat, string chassis_n, string vehicle_b, double insurance_a, double t, double ex_showroom_pr, int no_of_s)
    : bikeCategory(bCat), Vehicle(chassis_n, vehicle_b, insurance_a, t, ex_showroom_pr, no_of_s)
{
}

Bike::~Bike()
{
    std::cout << "~Bike() called..." << std::endl;
}

void Bike::display()
{
    Vehicle::display();

    cout << "Bike CAtegories --> " << endl;
    switch (bikeCategory)
    {
    case BikeCategory::COMMUTE:
        cout << "COMMUTE" << endl;
        break;

    case BikeCategory::SPORTS:
        cout << "SPORTS" << endl;
        break;

    case BikeCategory::OFFROADER:
        cout << "OFFROADER" << endl;
        break;

    default:
        break;
    }
}

void Bike::Accept()
{
    Vehicle::display();
    std::cout<<"Enter bike category : "<<endl;
    int cat;
    std::cin>>cat;
    bikeCategory = (BikeCategory)cat;
}

#include "Car.h"

Car::Car()
{
    carCategoryObj = CarCategory ::SEDAN;
}

Car::Car(CarCategory cCat, string chassis_n, string vehicle_b, double insurance_a, double t, double ex_showroom_p, int no_of_s)
    : carCategoryObj(cCat), Vehicle(chassis_n, vehicle_b, insurance_a, t, ex_showroom_p, no_of_s)
{
}

void Car::display()
{
    Vehicle ::display();
    cout << "Car Categories --> " << endl;
    switch (carCategoryObj)
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
    Vehicle::Accept();
    cout << "Enter Car Category : SEDAN , HATCHBACK , SUV : " << endl;
    int ctype;
    cin >> ctype;
    carCategoryObj = (CarCategory)ctype;
}

Car::~Car()
{
    cout << "~Car() called..." << endl;
}

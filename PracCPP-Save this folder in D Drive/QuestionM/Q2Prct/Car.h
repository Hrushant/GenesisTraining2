#include <iostream>
#include "Vehicle.h"
using namespace std;

enum CarCategory
{
    SEDAN,
    HATCHBACK,
    SUV
};

class Car : public Vehicle
{
    CarCategory carCategoryObj;
    public:
        Car();
        Car(CarCategory,string, string, double, double, double, int);
        void display();
        void Accept();
        ~Car();

        CarCategory getCarCategoryObj() const { return carCategoryObj; }
        void setCarCategoryObj(const CarCategory &carCategoryObj_) { carCategoryObj = carCategoryObj_; }
};
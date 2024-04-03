#include <iostream>
#include "Vehicle.h"

enum CarCategory
{
    SUV,
    HATCHBACK,
    SEDAN
};

class Car : public Vehicle
{
    CarCategory carCategory;

public:
    Car();
    Car(CarCategory, string, string, double, double, double, int);
    ~Car();
    void display();
    void Accept();

    CarCategory getCarCategory() const { return carCategory; }
    void setCarCategory(const CarCategory &carCategory_) { carCategory = carCategory_; }
};
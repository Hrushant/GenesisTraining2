#include <iostream>
#include "Vehicle.h"
using namespace std;

enum BikeCategory
{
    COMMUTE,
    SPORTS,
    OFFROADER
};

class Bike : public Vehicle
{
    BikeCategory bikeCategory;

public:
    Bike();
    Bike(BikeCategory, string, string, double, double, double, int);
    ~Bike();
    void display();
    void Accept();

    BikeCategory getBikeCategory() const { return bikeCategory; }
    void setBikeCategory(const BikeCategory &bikeCategory_) { bikeCategory = bikeCategory_; }
};
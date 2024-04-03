#ifndef VEHICLE_H
#define VEHICLE_H

#include <iostream>
using namespace std;

class Vehicle
{
    string chassis_no;
    string vehicle_brand;
    double insurance_amt;
    double tax;
    double ex_showroom_price;
    int no_of_seats;

public:
    Vehicle();
    Vehicle(string, string, double, double, double, int);
    virtual void display();
    virtual ~Vehicle();
    virtual void Accept();

    string getchassisNo() const { return chassis_no; }
    void setChassisNo(const string &chassisNo) { chassis_no = chassisNo; }

    string getvehicleBrand() const { return vehicle_brand; }
    void setVehicleBrand(const string &vehicleBrand) { vehicle_brand = vehicleBrand; }

    double getinsuranceAmt() const { return insurance_amt; }
    void setInsuranceAmt(double insuranceAmt) { insurance_amt = insuranceAmt; }

    double getTax() const { return tax; }
    void setTax(double tax_) { tax = tax_; }

    double getexShowroomPrice() const { return ex_showroom_price; }
    void setExShowroomPrice(double exShowroomPrice) { ex_showroom_price = exShowroomPrice; }

    int getnoOfSeats() const { return no_of_seats; }
    void setNoOfSeats(int noOfSeats) { no_of_seats = noOfSeats; }

    

    

    

    
};

#endif // VEHICLE_H

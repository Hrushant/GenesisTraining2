#include "Vehicle.h"

Vehicle::Vehicle()
{
    chassis_no = "A01";
    vehicle_brand = "SEDAN";
    insurance_amt = 9000;
    tax = 900;
    ex_showroom_price = 40000;
    no_of_seats = 4;
}

Vehicle::Vehicle(string chassis_n, string vehicle_b, double insurance_a, double t, double ex_showroom_p, int no_of_s)
{
    chassis_no = chassis_n;
    vehicle_brand = vehicle_b;
    insurance_amt = insurance_a;
    tax = t;
    ex_showroom_price = ex_showroom_p;
    no_of_seats = no_of_s;
}

void Vehicle::display()
{
    cout << "chassis_no : " << chassis_no << endl;
    cout << "vehicle_brand : " << vehicle_brand << endl;
    cout << "insurance_amt : " << insurance_amt << endl;
    cout << "tax : " << tax << endl;
    cout << "ex_showroom_price : " << ex_showroom_price << endl;
    cout << "no_of_seats : " << no_of_seats << endl;
}

Vehicle::~Vehicle()
{
    cout << "~Vehicle() called..." << endl;
}

void Vehicle::Accept()
{
    cout << "Enter chassis_no, Enter vehicle_brand , Enter insurance_amt , Enter tax , Enter ex_showroom_price , Enter no_of_seats : " << endl;
    cin >> chassis_no >> vehicle_brand >> insurance_amt >> tax >> ex_showroom_price >> no_of_seats;
}

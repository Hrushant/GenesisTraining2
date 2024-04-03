#include "Vehicle.h"
using namespace std;

Vehicle::Vehicle()
{
    chassis_no = "A01";
    vehicle_brand = "Seaden";
    insurance_amt = 50000;
    tax = 100;
    ex_showroom_price = 40000;
    no_of_seats = 4;
}

Vehicle::Vehicle(string chassis_n, string vehicle_b, double insurance_a, double t, double ex_showroom_pr, int no_of_s)
{
    chassis_no = chassis_n;
    vehicle_brand = vehicle_b;
    insurance_amt = insurance_a;
    tax = t;
    ex_showroom_price = ex_showroom_pr;
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
    cout << "~Vehicle() called " << endl;
}

void Vehicle::Accept()
{
    cout << "Enter chassis_no : " << endl;
    cin >> chassis_no;
    cout << "Enter vehicle_brand : " << endl;
    cin >> vehicle_brand;
    cout << "Enter insurance_amt : " << endl;
    cin >> insurance_amt;
    cout << "Enter tax : " << endl;
    cin >> tax;
    cout << "Enter ex_showroom_price : " << endl;
    cin >> ex_showroom_price;
    cout << "Enter no_of_seats : " << endl;
    cin >> no_of_seats;
}

#include <iostream>
#include "Customer.h"
#include "Date.h"

class Bill
{
    int billnumber;
    int billamount;
    Customer customerinfo;
    Date billdate;

public:
    Bill();
    void Accept();
    friend std::ostream &operator<<(std::ostream &os, const Bill &b);
    ~Bill();

    int getBillnumber() const { return billnumber; }
    void setBillnumber(int billnumber_) { billnumber = billnumber_; }

    int getBillamount() const { return billamount; }
    void setBillamount(int billamount_) { billamount = billamount_; }

    Customer getCustomerinfo() const { return customerinfo; }
    void setCustomerinfo(const Customer &customerinfo_) { customerinfo = customerinfo_; }

    Date getBilldate() const { return billdate; }
    void setBilldate(const Date &billdate_) { billdate = billdate_; }
};
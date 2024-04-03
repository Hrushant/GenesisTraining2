#include<iostream>
#include "Customer.h"
#include "Date.h"
 
class Bill 
{
    int billnumber;
    Customer customerinfo;
    Date billdate;
    int billamount;


    public:
        Bill();
        void Accept();
        ~Bill();
        friend std::ostream &operator<<(std::ostream &os,const Bill &b);

        int getBillnumber() const { return billnumber; }
        void setBillnumber(int billnumber_) { billnumber = billnumber_; }

        Customer getCustomerinfo() const { return customerinfo; }
        void setCustomerinfo(const Customer &customerinfo_) { customerinfo = customerinfo_; }

        Date getBilldate() const { return billdate; }
        void setBilldate(const Date &billdate_) { billdate = billdate_; }

        int getBillamount() const { return billamount; }
        void setBillamount(int billamount_) { billamount = billamount_; }
        
};
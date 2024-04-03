
#include "Account.h"

int main(){
    Account a;
    a.display();

    Account a1(402,"Ashish",8000);
    a1.display();

    Account *ptr = new Account;
    ptr->display();

    Account *ptr1 = new Account(403,"Abhijit",900000);
    ptr1->display();

    Account acc[3] = {{411,"Ansh",900},{412,"Krish",700},{413,"Dipak",670}};
    for(int i=0;i<3;i++){
        acc[i].display();
    }

    delete ptr;
}
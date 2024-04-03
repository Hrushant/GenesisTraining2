#include <iostream>
#include <cstring>   // for string
using namespace std; // for cout

class Account
{
    int accNo;
    char *name;
    double balance;

public:
    ~Account() // destructor
    {
        delete name;
        cout << "~Account --> name deleted..." << endl;
    }
    Account() // constructor
    {
        accNo = 101;
        name = new char[20];
        strcpy(name, "Ram");
        balance = 9000;
        cout << "Default const --> Account --> " << endl;
    }
    Account(int aNo, const char *nm, double bal) // parameterised constructor
    {
        accNo = aNo;
        name = new char[strlen(nm) + 1];
        strcpy(name, nm);
        balance = bal;
        cout << "Parameterised constructor --> Account --> " << endl;
    }
    Account(const Account &ac2) // for copy constructor
    {
        accNo = ac2.accNo;
        name = new char[strlen(ac2.name) + 1];
        strcpy(name, ac2.name);
        balance = ac2.balance;
        cout << "Copy constructor --> Account --> " << endl;
    }
    void display()
    {
        cout << "Account number : " << accNo << endl;
        cout << "Account name : " << name << endl;
        cout << "Account balance : " << balance << endl;
    }

    void deposit(double amount)
    {
        balance += amount;
    }

    void withdraw(double amount)
    {
        balance -= amount;
    }

    double getBalance() const { return balance; }
    void setBalance(double balance_) { balance = balance_; }
};

int main()
{
    Account a1; // default const
    a1.display();

    cout << "---------------------------------------------" << endl;

    Account a2(102, "jay", 6700); // parameterised const
    a2.display();

    cout << "---------------------------------------------" << endl;

    // Account *aptr = new Account;
    // delete aptr;  // request to call destructor

    Account a3(a2); // Copy constructor
    a3.display();

    cout << "---------------------------------------------" << endl;

    a2.deposit(300); // Deposit
    cout << "Updated balance after deposit = " << a2.getBalance() << endl;

    a2.withdraw(300); // Withdraw
    cout << "Updated balance after withdraw = " << a2.getBalance() << endl;

    cout << "---------------------------------------------" << endl;
}
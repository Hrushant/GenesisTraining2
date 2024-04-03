#include "salesperson.h"
#include "manager.h"
#include <typeinfo>

int main()
{
    // Salesperson sp1;
    // sp1.display();
    // std::cout << sp1.calTotalSalary() << std::endl;

    // Emp *ep = new Salesperson(); //-->default constructor
    // ep->display();
    // std::cout << "Total salary : " << ep->calTotalSalary() << std::endl;
    // Salesperson *sp = dynamic_cast<Salesperson *>(ep); // type casting
    // std::cout << "Commision calculated : " << sp->calCommision() << std::endl;
    // delete ep; // compulsory deleted otherwise memory leakage happens

    /*/*--------------------------------------------------------->
    Emp *eptr = new Salesperson(104, "Hrushant", 34000, 500000, 0.04); //-->Parameterised constructor
    eptr->display();
    std::cout << "Total salary : " << eptr->calTotalSalary() << std::endl;
    if (typeid(*eptr) == typeid(Salesperson)) // check types
    {
        Salesperson *sp = dynamic_cast<Salesperson *>(eptr); // safe down casting
        // down cast --> convert base class pointer to derive class pointer
        //  dynamic cast --> return zero if casting is failed (in case of pointers)
        //                   returns address on succesful type cast

        if (sp == 0)
        {
            std::cout << "type casting failed" << std::endl;
        }
        else
        {
            sp->calCommision();
        }
    }
    else
    {
        std::cout << "It is not a salesperson object" << std::endl;
    }
    delete eptr; // compulsory deleted otherwise memory leakage happens
    --------------------------------------------------------->*/

    // Emp *ep3 = new Manager();
    // ep3->display();
    // std::cout << "Total salary : " << ep3->calTotalSalary() << std::endl;
    // delete ep3;

    // Emp *eptr1 = new Manager(104, "Hrushant", 25000, 100, 100);
    // eptr1->display();
    // std::cout << "Total salary : " << eptr1->calTotalSalary() << std::endl;
    // delete eptr1;


    /*--------------------------------------------------------->
    // Salesperson sp1(102, "Rahul", 90000, 300000, 0.05);
    // Emp &e = sp1;
    Manager mgr;
    Emp &e = mgr;
    // If casting fails (in case of reference then it throws exception)
    try
    {
        Salesperson &spref = dynamic_cast<Salesperson &>(e);
        spref.calCommision();
    }
    catch (std::bad_cast &obj)
    {
        std::cout << obj.what() << std::endl;
    }

    --------------------------------------------------------*/
}

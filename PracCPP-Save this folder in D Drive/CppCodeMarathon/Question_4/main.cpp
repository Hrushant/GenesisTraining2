#include <iostream>
#include "Player.h"

int main()
{
    int noOfMatch[3] = {90, 70, 80};
    Player p1(noOfMatch);

    int noOfMatch1[3] = {90, 70, 80};
    Player p2(noOfMatch1);

    if (p1.calAvg() == p2.calAvg())
    {
        std::cout << "True" << std::endl;
    }
    else
    {
        std::cout << "False" << std::endl;
    }

    std::cout<<"score at given index : "<<p1[1]<<std::endl;

    Player p3;
    std::cin>>p3;
    std::cout<<p3;
}

// default const
// parameterised const
// copy const
// shows score at given index
// destructor
// << >> operator
// = operator

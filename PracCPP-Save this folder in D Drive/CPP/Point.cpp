#include <iostream>
using namespace std;

class Point
{
    int x, y;

public:
    Point()
    {
        x = 0;
        y = 0;
    }
    Point(int x, int y)
    {
        this->x = x;
        this->y = y;
    }
    void display()
    {
        cout << x << " " << y << endl;
    }
    Point operator+(const Point &p2)
    {
        Point pobj;
        pobj.x = this->x + p2.x;
        pobj.y = this->y + p2.y;
        return pobj;
    }
    bool operator==(const Point &p2)
    {
        return this->x == p2.x && this->y == p2.y;
    }

    friend ostream &operator<<(ostream &os, const Point &pp); // it is non member function --> it can access private data of that class bcoz it is friend function

    Point &operator++()
    {
        ++x;
        ++y;
        return *this;
    }

    Point operator++(int) // write dummy parameter "int" for post increment <-- compulsory
    {
        Point tempObj = *this;
        x++;
        y++;
        return tempObj;
    }

    // istream for user input-->
    friend istream &operator>>(istream &os, Point &pp);
};

ostream &operator<<(ostream &os, const Point &pp) // do not use :: operator  // always return pass reference to avoid the copy creation and pass const so it do not change this value
{
    os << pp.x << " " << pp.y << endl;
    return os;
}

// istream for user input-->
istream &operator>>(istream &is, Point &pp) {
    cout << "Enter x and y : " << endl;
    is >> pp.x >> pp.y;
    return is;
}

int main()
{
    Point p1(2, 1), p2(4, 5);

    if (p1 == p2)
    {
        cout << "Equal points" << endl;
    }
    else
    {
        cout << "Unequal points" << endl;
    }

    // -------------------------------------------------------------

    Point p3 = p1 + p2; // p1.operator + (p2)
    p3.display();

    cout << "----------------------" << endl;
    cout << p2 << p3;
    cout << "----------------------" << endl;

    // ---------------------------------------------------------------
    Point p4(4, 6);
    Point p5 = ++p4; // p4.operator++()  //pre-increment
    cout << p4;      // 5 7
    cout << p5;      // 5 7

    Point p6(6, 8);
    Point p7 = p6++; // post-increment
    cout << p6;      // 7 9
    cout << p7;      // 6 8

    // -------------------------------------------------------------

    // istream for user input-->
    Point p9;
    cin >> p9;
    cout << p9;
}

// Scope resolution operator --> :: --> identify functionality of particular class  --> it can't be overloaded
// ostream class --> we can't create objects of ostream class
// eq points , print points,i/p print point, point add, pre incre,post incre.

#include <iostream>
using namespace std;

class Point
{
    int x, y;

public:
    Point()
    {
        x = 10;
        y = 20;
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
    bool operator==(const Point &p)
    {
        return this->x == p.x && this->y == p.y;
    }

    friend ostream &operator<<(ostream &os, const Point &p);
    friend istream &operator>>(istream &is, Point &p);

    Point operator+(const Point &p)
    {
        Point obj;
        obj.x = this->x + p.x;
        obj.y = this->y + p.y;
        return obj;
    }

    Point operator++()
    {
        ++x;
        ++y;
        return *this;
    }

    Point operator++(int)
    {
        Point obj = *this;
        x++;
        y++;
        return obj;
    }
};

ostream &operator<<(ostream &os, const Point &p)
{
    os << p.x << " " << p.y << endl;
    return os;
}

istream &operator>>(istream &is, Point &p)
{
    cout << "Enter teo points : " << endl;
    is >> p.x >> p.y;
    return is;
}

int main()
{
    Point p1(2, 3), p2(5, 6);
    if (p1 == p2)
    {
        cout << "same" << endl;
    }
    else
    {
        cout << "not same" << endl;
    }

    cout << "--------------------------------------------" << endl;

    cout << p1 << p2;

    cout << "--------------------------------------------" << endl;

    // Point p3;
    // cin>>p3;
    // cout<<p3;

    cout << "--------------------------------------------" << endl;

    // cout<<p1<<p2<<p3;

    cout << "--------------------------------------------" << endl;

    Point p4 = p1 + p2;
    p4.display();

    cout << "--------------------------------------------" << endl;

    Point p5 = ++p1;
    cout << p1;

    Point p6 = p2++;
    cout << p2;

    cout << "--------------------------------------------" << endl;
}

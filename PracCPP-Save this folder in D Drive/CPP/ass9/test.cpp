#include <iostream>
using namespace std;

// We can not create obj of abstract class
// we can create pointer/reference to abstract class

class Shape // abstract class
{
    string color;

public:
    Shape() : color("white") {}
    Shape(string c) : color(c) {}
    void fillColor()
    {
        cout << "Filling with " << color << " color" << endl;
    }
    virtual void calarea() = 0; // pure virtual function (in java we called it abstract funct)
};

class Circle : public Shape
{
    double radius;

public:
    Circle() : radius(5) {}
    Circle(string c, double r) : Shape(c), radius(r) {}
    void calarea()
    {
        cout << "Area of circle : " << 3.14 * radius * radius << endl;
    }
};

class Square : public Shape
{
    double side;

public:
    Square() : side(5) {}
    Square(string c, double s) : Shape(c), side(s) {}
    void calarea()
    {
        cout << "Area of circle : " << side * side << endl;
    }
};

int main()
{
    cout << "----------------------------------------" << endl;

    Shape *sp = new Circle("Red", 3);
    sp->fillColor();
    sp->calarea();

    cout << "---------------------" << endl;

    sp = new Square;
    sp->fillColor();
    sp->calarea();

    cout << "----------------------------------------" << endl;
}

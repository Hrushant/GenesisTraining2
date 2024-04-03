#include <iostream>
#include <cstring>
using namespace std;

class Product
{
    int productCode; // By using [ ctrl + . ] we can create getters and setters  // private
    char pname[20];
    static int x; // Single copy per class is created
public:
    int k = 90;

    static void showx()
    {
        cout << x;
    }
    static void showcount()
    {
        x++;
        cout << x;
    }

    Product() // Default constructor
    {
        productCode = 883010;
    }
    Product(int pCode, const char *proName) // parameterised constructor
    {
        productCode = pCode;
        strcpy(pname, proName);
    }
    void display()
    {
        cout << productCode << " " << pname;
    }

    // Getters and Setters
    int getProductCode() const { return productCode; }
    void setProductCode(int productCode_) { productCode = productCode_; }

    const char *getPname() const { return pname; }
    void setPname(char *pname_) { strcpy(pname, pname_); }
};

int Product::x = 999; // Initialization of static variable

// Global function -->
// non-member function can access public data of a class using object
void show(const Product &pr)
{
    cout << "pCode : " << pr.getProductCode();
    cout << "pName : " << pr.getPname();
};

Product pro; // Global object 
int main()
{
    /*
    // Create obj
    Product p1; // p1 object is created in stack memory //Local object
    p1.display();

    Product p2(20, "Bag101");  //Local object
    p2.display();

    Product *ptr = new Product;
    ptr->display();

    Product *ptr2 = new Product(3312, "Pen");
    ptr2->display();

    Product parr[3] = {{101, "Bag"}, {102, "Pen"}, {103, "Sketch"}};
    for (int i = 0; i < 3; i++)
    {
        parr[i].display();
    }

    delete ptr; // Clean the memory allocated by new operator avoid memory leakage
    */

    Product::showx();
    Product::showcount();

    pro.display(); // call by using Global obj
    Product pr;    // Local object
    pr.display();  // call by using Local obj
}

// Static function can't access non static data.
// Global function can not access private data of any class

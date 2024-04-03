#include<iostream>
using namespace std;
class pro{
    static int x;
    public:
        pro(){
            x=90;
        }
        static void show(){
            cout<<x;
        }
};

int pro::x=10;

int main(){
    pro::show();
}
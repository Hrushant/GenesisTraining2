#include <iostream>
#include <cstring>
using namespace std;

class Student
{
    int id;
    char *name;
    int age;

public:
    ~Student()
    {
        delete name;
    }
    Student()
    {
        id = 101;
        name = new char[20];
        strcpy(name, "Ram");
        age = 99;
    }
    Student(int idd, const char *nm, int ag)
    {
        id = idd;
        name = new char[strlen(nm) + 1];
        strcpy(name, nm);
        age = ag;
    }
    Student(const Student &cc)
    {
        id = cc.id;
        name = new char[strlen(cc.name) + 1];
        strcpy(name, cc.name);
        age = cc.age;
    }
    void display()
    {
        cout << "Id : " << id << endl;
        cout << "name : " << name << endl;
        cout << "age : " << age << endl;
    }
    void changeName(const char* nm){
        name = new char[strlen(nm)+1];
        strcpy(name,nm);
    }

    char *getName() const { return name; }
    void setName(char *name_) { name = name_; }

    int getId() const { return id; }
    void setId(int id_) { id = id_; }

    int getAge() const { return age; }
    void setAge(int age_) { age = age_; }
};

int main()
{
    Student s;
    s.display();

    Student s1(909, "Sourabh", 88);
    s1.display();

    Student s3(s);
    s3.display();

    s1.changeName("Raghuvanshi");
    cout<<s1.getId();
    cout<<s1.getName();
    cout<<s1.getAge();
}
#include<iostream>
#include"Student.h"

int main(){
    Student s;
    s.display();

    Student s1(12,"Ratan",78);
    s1.display();

    Student *ptr = new Student(13,"Kishan",66);
    ptr-> display();

    Student stu[3] = {{21,"Ram",99},{22,"Ramayan",95},{23,"Jay",91}};
    for(int i=0;i<3;i++){
        stu[i].display();
    }

    delete ptr;
}


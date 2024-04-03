#include <iostream>
#include "Date.h"

enum Examtype
{
    ONLINE = 1,
    OFFLINE = 2
};

class Exam : public Date
{
    int exam_code;
    Examtype examtypeobj;
    Date exam_date;

public:
    Exam();
    Exam(int, Examtype, int, int, int);
    void display();
};
#include "Exam.h"

Exam::Exam()
{
    exam_code = 101;
}

Exam::Exam(int ex_code, Examtype extype, int d, int m, int y)
    : examtypeobj(extype), exam_date(d, m, y)
{
    exam_code = ex_code;
}

void Exam::display()
{
    std::cout << "exam_code : " << exam_code << std::endl;
    switch (examtypeobj)
    {
    case Examtype::ONLINE:
        std::cout << "Exam code type : "
                  << "ONLINE" << std::endl;
        break;

    case Examtype::OFFLINE:
        std::cout << "Exam code type : "
                  << "OFFLINE" << std::endl;
        break;

    default:
        break;
    }

    std::cout << "Date details --> " << std::endl;
    exam_date.Print();
}

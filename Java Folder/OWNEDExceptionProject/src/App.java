public class App {
    public static void main(String[] args) {
        try {
            School sc = new School("Hrushant");
        } catch (studentNameException s) {
            System.out.println("My name is " + s);
        }
    }
}

class School {
    String studentName;

    public School(String studentName) {
        this.studentName = studentName;
    }

    if(studentName=="Hrush")

    {
        throw new studentNameException("studentName is " + studentName);
    }
}

class studentNameException extends Exception {
    public studentNameException(String msg) {
        super(msg);
    }
}
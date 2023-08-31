package Java_Barry_Burd.chapter9.student;

import static java.lang.System.out;

public class GetStringStudent extends Student{

    // Constructors:
    public GetStringStudent(String name, int id){
        super(name, id);
    }
    public GetStringStudent(String name, int id, double gpa){
        super(name, id, gpa);
    }
    public GetStringStudent(String name, int id, Major major){
        super(name, id, major);
    }
    public GetStringStudent(String name, int id, double gpa, Major major){
        super(name, id, gpa, major);
    }

    // Method:
    public String getString(){

            String info = "Name:"  + getName() + "; ";
            info += "ID:" + getId() + "; ";
            info += "GPA:" + ((getGpa() >= 0.0 && getGpa() <=4.0 )?getGpa():"None") + "; ";
            info += "Major:" + ((getMajor() != null)?getMajor():"None");
            return info;
    }
}

class UseGetString {
    public static void main(String[] args) {
    GetStringStudent stringStudent = new GetStringStudent("Teresa Darian", 4, 3.00, Major.MATHEMATICS);
        out.println(stringStudent.getString());

    GetStringStudent stringStudent1 = new GetStringStudent("Tony Style", 5);
        out.println(stringStudent1.getString());

    GetStringStudent stringStudent2 = new GetStringStudent("Lucy Lu", 6, 2.77);
        out.println(stringStudent2.getString());

    GetStringStudent stringStudent3 = new GetStringStudent("Nick Cannon", 7, Major.PHYSICS);
        out.println(stringStudent3.getString());

    /*Output:
        Name:Teresa Darian; ID:4; GPA:3.0; Major:MATHEMATICS
        Name:Tony Style; ID:5; GPA:0.0; Major:None
        Name:Lucy Lu; ID:6; GPA:2.77; Major:None
        Name:Nick Cannon; ID:7; GPA:0.0; Major:PHYSICS */

    }
}

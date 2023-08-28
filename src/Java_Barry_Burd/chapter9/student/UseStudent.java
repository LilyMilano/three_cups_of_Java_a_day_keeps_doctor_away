package Java_Barry_Burd.chapter9.student;

import static java.lang.System.out;
public class UseStudent {
    public static void main(String[] args) {

        // New Objects - Student type:
        Student student1 = new Student("Mariana Green", 1);
        Student student2 = new Student("Dan Brown",2,3.77);
        Student student3 = new Student("Victor Hugo",3, Major.LITERATURE);
        Student student4 = new Student("Elizabeth Gilbert",4,4.00, Major.COMPUTER_SCIENCE);

        // Print out:
        student1.display();
        student2.display();
        student3.display();
        student4.display();




        /*
        Output:
        Name:Mariana Green; ID:1; GPA:0.0; Major:None
        Name:Dan Brown; ID:2; GPA:3.77; Major:None
        Name:Victor Hugo; ID:3; GPA:0.0; Major:LITERATURE
        Name:Elizabeth Gilbert; ID:4; GPA:4.0; Major:COMPUTER_SCIENCE
        */
    }
}

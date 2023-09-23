package Java_Barry_Burd.chapter9.student;

public class UseStudentWithGrades {
    public static void main(String[] args) {

        // New Objects:

        var student1 = new StudentWithGrades("Susan Thomas", 1, new double[]{1.0, 1.0, 1.0, 1.0, 1.0});
        var student2 = new StudentWithGrades("Jane Stay", 2, new double[]{3.5, 4.0, 1.0, 2.9, 3.3});
        var student3 = new StudentWithGrades("Albert Einstein", 3, new double[]{4.0, 4.0, 4.0, 4.0, 4.0});

        // Display:

        student1.display();
        student2.display();
        student3.display();
    }
}

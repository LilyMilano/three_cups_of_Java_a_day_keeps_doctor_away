package Java_Barry_Burd.chapter7_GUI;

public class Hello2U {

    public static void main(String[] args) {
        var frame = new PracticeFrame("Greet Me!");
        frame.addRow("Your first name");
        frame.go();
    }

    public static String calculate(String firstName) {
        return "Hello, " + firstName + "!";
    }
}

package Java_Barry_Burd.chapter7_GUI;

public class Addition {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("Adding Machine");
        frame.addRow("First number");
        frame.addRow("Second number");
        frame.setButtonText("Sum");
        frame.go();
    }
    public static int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

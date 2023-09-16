package Java_Barry_Burd.chapter11.hotel;
import Java_Barry_Burd.chapter7_GUI.PracticeFrame;
public class ShowGuestGUI {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("Hotel");
        frame.addRow("Room number");
        frame.setButtonText("Number of Guests in the room");
        frame.go();
    }
    public static int calculate(int room){
        int[] guests = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};

        return guests[room];
    }
}

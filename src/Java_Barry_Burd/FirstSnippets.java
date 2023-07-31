package Java_Barry_Burd;

public class FirstSnippets {
    public static void main(String[] args) {

        //Pay Barry
        double checkAmount = 1257.03;
        String author = "Barry Burd";
        System.out.println("Pay to the order of " + author + ": $" + checkAmount);

        // Looking for a vacant room
        int guests;

        for(int roomNum = 1; roomNum <= 100; roomNum++) {

            if(roomNum == 11 || roomNum == 22 || roomNum == 33 || roomNum == 44 ||
                    roomNum == 55 || roomNum == 66 || roomNum == 77 || roomNum == 88 ||
                    roomNum == 99) {

                guests = 0;

            } else {
                guests = 2;
            }

            if(guests == 0) {
                System.out.println("Room " + roomNum + " is vacant");
            } else {
                System.out.println("Room " + roomNum + " is occupied");
            }
        }
    }
}
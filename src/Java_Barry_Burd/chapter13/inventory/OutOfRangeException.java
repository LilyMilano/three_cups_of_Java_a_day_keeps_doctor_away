package Java_Barry_Burd.chapter13.inventory;

public class OutOfRangeException extends RuntimeException{
    public OutOfRangeException(String message) {
        super("A value is out of range.\n" + message);
    }
}

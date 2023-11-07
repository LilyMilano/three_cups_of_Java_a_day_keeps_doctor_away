package Java_Barry_Burd.chapter15.ascii_art;
import static java.lang.System.out;

public class Square extends Shape{
    public Square(int size) {
        super(size);
    }
    @Override
    public void show() {

        // Print top border
        out.println(" ");
        for(int i = 1; i < size; i++){
            out.print("--");
        }

        out.println();

        // Print middle rows
        for (int row = 1; row < size - 1; row++) {
            out.print("|");
            for (int i = 1; i < size; i++) {
                out.print("  ");
            }
            out.print("|");
            out.println();
        }

        // Print bottom border
        out.print(" ");
        for (int i = 1; i < size; i++) {
            out.print("--");
        }
        out.println();
    }
}

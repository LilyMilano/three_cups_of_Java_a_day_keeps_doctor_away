package Java_Barry_Burd.chapter15.ascii_art;
import static java.lang.System.out;

public class Triangle extends Shape{
    public Triangle(int size){
        super(size);
    }

    @Override
    public void show() {
        // Print rows:
        for (int row = 0; row < size; row++) {
            // Print spaces before slash:
            for (int i = 0; i < size - row; i++) {
                out.print(" ");
            }
            // Print slash:
            out.print("/");
            for (int i = size - row; i < size + row; i++) {
                // Print middle spaces:
                out.print(" ");
            }
            // Print backslash:
            out.print("\\");
            out.println();
        }
        // Print bottom border:
        out.print(" ");
        for (int i = 0; i < size * 2; i++) {
            out.print("-");
        }
        out.println();
    }
}

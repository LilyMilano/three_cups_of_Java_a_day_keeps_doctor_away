package Java_Barry_Burd.chapter15.ascii_art;

abstract public class Shape {

    // Field:
    int size;

    // Constructor:
    public Shape(int size){
        this.size = size;
    }

    // Abstract Method:
    abstract public void show();
}

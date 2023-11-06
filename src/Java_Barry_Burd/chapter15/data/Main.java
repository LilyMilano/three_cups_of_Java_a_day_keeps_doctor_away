package Java_Barry_Burd.chapter15.data;
public class Main {
    public static void main(String[] args) {
        double numbers[] = {21.7, 68.3, 5.5};
        var column = new DeletableColumnOfNumbers(numbers);

        deleteMe(column);
        displayMe(column);

        DeletableTable table = new DeletableTable("MyTable.txt");

        deleteMe(table);
        displayMe(table);
    }
    static void displayMe(Displayable displayable) {
        displayable.display();
        System.out.println();
    }
    static void summarizeMe(Summarize summarize) {
        System.out.println(summarize.summarize());
        System.out.println();
    }
    static void deleteMe(Deletable deletable) {
        deletable.delete();
    }
}

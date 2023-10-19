package Java_Barry_Burd.chapter12.main;
import java.util.ArrayList;
import  static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheList(list);
        for(Integer n : list){
            out.println(n);
            /*Output:
            85
            19
            0
            103
            13*/
        }
        out.println();
        double i = 5.0, j = 7.0;
        out.println(Double.sum(i, j));
    }

    public static void fillTheList(ArrayList<Integer> list) {
        list.add(85);   // Autoboxing
        list.add(19);
        list.add(0);
        list.add(103);
        list.add(13);
    }
}

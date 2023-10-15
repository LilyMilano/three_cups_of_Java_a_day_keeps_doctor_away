package Java_Barry_Burd.chapter12.people;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.out;
public class ShowNamesAgain {
    public static void main(String[] args) throws IOException {
        ArrayList<String> people = new ArrayList<>();
        Scanner diskScanner = new Scanner(new File("names.txt"));

        while(diskScanner.hasNext()){
            people.add(diskScanner.nextLine());
        }
        people.remove(0);
        people.add(2, "Jim Newton");

        Iterator<String> iterator = people.iterator();
        while(iterator.hasNext()) {
            out.println(iterator.next());
        }
        diskScanner.close();

        /*Output:
        Harriet Ritter
        Weelie J. Katz
        Jim Newton
        Harry "The Crazyman" Spoonswagler
        Filicia "Fishy" Katz
        Mia, Just "Mia"
        Jeremy Flooflong Jones
        I. M. D'Arthur
        Hugh R. DaReader*/
    }
}

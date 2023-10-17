package Java_Barry_Burd.chapter12.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class InsertInOrder {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "dog"
                , "horse", "zebra"));
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an animal (or quit to exit): ");
            String input = keyboard.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int index = findInsertionIndex(animals, input);
            animals.add(index, input);
        }
        keyboard.close();

        System.out.println("Animals in sorted order:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
    private static int findInsertionIndex(ArrayList<String> animals,
            String input){
        // Checks if the input comes BEFORE current animal alphabetically
        int index = 0;
        for (String animal : animals) {
            if (input.compareToIgnoreCase(animal) < 0) {
                break;
            }
            index++;
        }
        return index;
    }
}

























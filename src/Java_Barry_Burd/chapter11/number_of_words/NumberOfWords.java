package Java_Barry_Burd.chapter11.number_of_words;

import java.util.Scanner;

import static java.lang.System.*;

public class NumberOfWords {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(in);
        out.print("Enter a page number from 1 to 7: ");
        int page = keyboard.nextInt();

        int[] words = {0, 296, 342, 405, 363, 350, 323, 101};

        if (page >= 1 && page <= 7) {

            out.printf("Number of words in page %d is: %d%n", page, words[page]);
        } else {
            out.println("Not defined");
        }

        keyboard.close();
    }
}


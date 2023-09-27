package LeetCode.Arrays;

import java.util.Arrays;

public class UseDVD {
    public static void main(String[] args) {

        DVD[] dvdCollection = new DVD[15];

        // Instance a DVD class Objects:
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starsWarsDVD = new DVD("Stars Wars", 1977, "George Lucas");

        // Next we'll put it into the Array:
        dvdCollection[7] = avengersDVD;
        dvdCollection[3] = incrediblesDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = starsWarsDVD;

        // Print out:
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);
        System.out.println();

        /*Output:
        The Avengers, directed by Joss Whedon, released in 2012
        null
        Stars Wars, directed by George Lucas, released in 1977*/

        //......................................................................

        int[] squareNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }
        System.out.println(Arrays.toString(squareNumbers));
        // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println();

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // Access and print what's at the i'th index.
            System.out.println(squareNumbers[i]);
        }
        System.out.println();
        /*Output:
        1
        4
        9
        16
        25
        36
        49
        64
        81
        100*/

        // For each loop:  For each VALUE in the Array:
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.println(square);
        }
        System.out.println();

        //......................................................................
        // Array Capacity: The Array  can hold up to 6 DVDs. This is the
        // Array's capacity.
        DVD[] array = new DVD[6];

        int capacity = array.length;
        System.out.println("The Array has a capacity of " + capacity);
        System.out.println();
        // Output: The Array has a capacity of 6
        //......................................................................

        // Array Length: The number of items, currently in the Array.
        int[] items = new int[6]; // Capacity: 6

        int length = 0; // Current length is 0, because it has 0 elements

        // Add three items into it:
        for (int i = 0; i < 3; i++) {
            items[i] = i * i;
            length++;
        }

        System.out.println("The Array has a capacity of " + items.length);
        System.out.println("The Array has a length of " + length);
        System.out.println(Arrays.toString(items));
        System.out.println();
        /*Output:
        The Array has a capacity of 6
        The Array has a length of 3
        [0, 1, 4, 0, 0, 0]*/

        //...................................................................
        // Given a binary array, find the maximum number of consecutive 1s in
        // this array.

        int[] numbers = new int[]{1, 1, 0, 1, 1, 1};

        int currentConsecutiveOnes = 0;
        int maxConsecutiveOnes = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes,
                        currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }
        System.out.println("Maximum number of consecutive 1s: " + maxConsecutiveOnes);
        // Output: Maximum number of consecutive 1s: 3
    }
}



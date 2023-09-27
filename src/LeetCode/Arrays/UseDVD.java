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
        System.out.println();
        //...................................................................

        // Array Insertions:
        // 1. Inserting at the End of an Array:

        // Declare an integer array of six elements:
        int[] elements = new int[6];
        length = 0;

        // Add three elements into the array:
        for (int i = 0; i < 3; i++) {
            elements[length] = i;
            length++;
        }

        // Insert a new element at the end of the Array. Again,
        // it's important to ensure that there is enough space
        // in the array for inserting a new element.
        elements[length] = 10;
        length++;

        // Let's visualise what's happening:
        printElements(elements);
        System.out.println();

        /* Output:
        Index 0 contains 0
        Index 1 contains 1
        Index 2 contains 2
        Index 3 contains 10
        Index 4 contains 0
        Index 5 contains 0 */

        // 2. Inserting at the Start of an Array:............................

        // First, we will have to create space for a new element.
        // We do that by shifting each element one index to the right.
        // This will firstly move the element at index 3, then 2, then 1, then finally 0.
        // We need to go backwards to avoid overwriting any elements.

        for (int i = 3; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }

        // Now that we have created space for the new element,
        // we can insert it at the beginning.
        elements[0] = 20;
        printElements(elements);
        System.out.println();

        /*Output:
        Index 0 contains 20
        Index 1 contains 0
        Index 2 contains 1
        Index 3 contains 2
        Index 4 contains 10
        Index 5 contains 0*/

        // 3. Inserting Anywhere in the Array...................................
        // Say we want to insert the element at index 2.
        // First, we will have to create space for the new element.
        for (int i = 4; i >= 2; i--)
        {
            // Shift each element one position to the right.
            elements[i + 1] = elements[i];
        }

// Now that we have created space for the new element,
// we can insert it at the required index.
        elements[2] = 30;
        printElements(elements);
        System.out.println();

        /* Output:
        Index 0 contains 20
        Index 1 contains 0
        Index 2 contains 30
        Index 3 contains 1
        Index 4 contains 2
        Index 5 contains 10 */
    }

    public static void printElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.println("Index " + i + " contains " + elements[i]);
        }
    }
}






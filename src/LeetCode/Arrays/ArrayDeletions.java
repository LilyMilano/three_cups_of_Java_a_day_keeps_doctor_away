package LeetCode.Arrays;
public class ArrayDeletions {

    public static void main(String[] args){

        // Declare an integer array of ten elements:
        int [] intArray = new int[10];

        // The array currently contains 0 elements:
        int length = 0;

        // Add elements at the first six indexes of the Array:
        for(int i = 0; i < 6; i++){
            intArray[length] = i;
            length++;
        }
        // Print
        printArrayCapacity(intArray);
        /* Output:
        Index 0 contains 0
        Index 1 contains 1
        Index 2 contains 2
        Index 3 contains 3
        Index 4 contains 4
        Index 5 contains 5
        Index 6 contains 0
        Index 7 contains 0
        Index 8 contains 0
        Index 9 contains 0*/

        System.out.println();
        printArrayLength(intArray, length);
        /*Output:
        Index 0 contains 0
        Index 1 contains 1
        Index 2 contains 2
        Index 3 contains 3
        Index 4 contains 4
        Index 5 contains 5*/

        // Deletion from the end is as simple as reducing the length:
        System.out.println();
        length--;
        printArrayLength(intArray, length);
        /*Output:
        Index 0 contains 0
        Index 1 contains 1
        Index 2 contains 2
        Index 3 contains 3
        Index 4 contains 4*/

        System.out.println();
        //...................................................................

        // Deleting From the Start of an Array: Starting at index 1, we shift
        // each element one position to the left.
        for(int i = 1; i < length; i++){
            intArray[i - 1] = intArray[i];
        }
        length--;
        printArrayLength(intArray, length);
        /*Output:
        Index 0 contains 1
        Index 1 contains 2
        Index 2 contains 3
        Index 3 contains 4*/
        System.out.println();

        // Deleting From Anywhere in the Array:
        // Say we want to delete the element at index 1:
        for(int i = 2; i < length; i++){
            intArray[i - 1] = intArray[i];
        }
        length--;
        printArrayLength(intArray, length);
        /*Output:
        Index 0 contains 1
        Index 1 contains 3
        Index 2 contains 4*/
    }

    public static void printArrayCapacity(int [] intArray) {
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
    public static void printArrayLength(int[] intArray, int length){
        for(int i = 0; i < length; i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}

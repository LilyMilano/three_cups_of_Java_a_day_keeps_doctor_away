package LeetCode.Arrays;
import java.util.Arrays;
public class InPlaceOperations {
    // Given an Array of integers, return an Array where every element at an even-indexed position is squared.
    public static int [] squareEven(int[] array, int length){
        // Check for edges cases:
        if(array == null){
            return null;
        }
        // Iterate through the original array:
        // If the index is an even number, then we need to square the element
        // and replace the original value in the array:
        for(int i = 0; i < length; i++){
            if(i % 2 == 0){
                array[i] *= array[i];
            }
            // We don't need to do anything for the odd indexes :-)
        }
        // We return the original array:
        return array;
    }
    public static void main(String[] args) {
        int [] array = {9, -2, -9, 11, 56, -12, -3};
        squareEven(array, array.length);
        System.out.println(Arrays.toString(array));
        // Output: [81, -2, 81, 11, 3136, -12, 9]
    }
}

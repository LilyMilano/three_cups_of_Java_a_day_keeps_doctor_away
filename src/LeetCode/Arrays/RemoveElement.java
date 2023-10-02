package LeetCode.Arrays;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Pointer to the current element

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // Move the non-val element to the current position
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement remove = new RemoveElement();
        // Create an instance of the RemoveElement class using the new
        // keyword and assigns it to the variable remove. This allows us to access the removeElement method.

        int newLength = remove.removeElement(nums, val);
        // It invokes the removeElement method on the remove object, passing the
        // nums array and val as arguments. The method returns the new length of the modified array, which is stored in the newLength variable.

        System.out.printf("Modified array: %s%n", Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.printf("Length of modified array: %d%n", newLength);

        /*Output:
        Modified array: [2, 2]
        Length of modified array: 2*/

        // Arrays.copyOf(nums, newLength): This method creates a new array by
        // copying a specified number of elements from the original array nums.
        // The nums array is the source array from which the elements will be copied, and newLength denotes the length of the new array.
        // The copyOf() method creates a new array with the specified length and copies the elements from the source array

        // Arrays.toString(array): This method converts an array into a string representation.
        // It takes an array as input, in this case, the new array created by copyOf(),
        // and returns a string representation of the array.
    }

}

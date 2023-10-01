package LeetCode.Arrays;

import java.util.Arrays;

public class DuplicateZeros {
    /*Given a fixed-length integer array arr, duplicate each occurrence of zero,
    shifting the remaining elements to the right.
    Note that elements beyond the length of the original array are not written.
    Do the above modifications to the input array in place and do not return
    anything.*/

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        /*Output:
        [1, 0, 0, 2, 3, 0, 0, 4]*/
    }

    public static void duplicateZeros(int[] arr) {
        // Find the final length of the modified array
        int finalLength = arr.length - 1;

        // Find the position where the modified array would end
        // by counting the number of zeros in the original array
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                finalLength++;
            }
        }

        // Modify the array in place
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                // Duplicate the zero if the modified array length is within
                // bounds
                if (finalLength < arr.length) {
                    arr[finalLength] = 0;
                }
                finalLength--;
            }

            // Copy the current element to the modified array
            if (finalLength < arr.length) {
                arr[finalLength] = arr[i];
            }
            finalLength--;
        }
    }
}

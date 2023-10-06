package LeetCode.Arrays;

public class ValidMountainArray {

    public static boolean isMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Check for increasing elements
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        // If peak is at the beginning or end, it is not a mountain array
        if (i == 0 || i == n - 1) {
            return false;
        }
        // Check for decreasing elements:
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        // If we reached the end, it is a mountain array:
        return i == n - 1;

        /* This code first checks for the increasing elements, then checks
        for the decreasing elements, and finally checks if we reached the
        end of the array. If all these conditions are satisfied, the array
        is considered a mountain array. The variable "i" represents the index
        of the peak element in the mountain array.*/
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        boolean isMountain = isMountainArray(arr);
        System.out.println(isMountain);
    }
}

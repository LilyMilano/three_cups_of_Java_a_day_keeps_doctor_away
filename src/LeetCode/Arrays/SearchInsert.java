package LeetCode.Arrays;

public class SearchInsert {
    public static int searchInsert(int[] numbers, int target) {
        // Binary search to find the target. Initialize left and right pointers
        int left = 0;
        int right = numbers.length - 1;

        // Calculate the middle index in each iteration as (left + right) / 2
        while(left <= right) {
            int mid = left + (right - left) / 2;

            // Compare numbers[mid] to the target. If equal, return mid. If
            // smaller (we know the target is in the right half), update left
            // pointer. If greater (we know the target is in the left half),
            // update right pointer.
            // Loop until left > right
            //When target is not found, left will be pointing to the insert index

            if(numbers[mid] == target) {
                return mid;
            } else if(numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 7;

        int index = searchInsert(numbers, target);
        System.out.println(index);
    }
}

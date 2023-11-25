package LeetCode.Arrays;
/*Given an array of integers numbers which is sorted in ascending order, and an
integer target, write a function to search target in numbers. If target exists,
then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
        Input: numbers = [-1,0,3,5,9,12], target = 9
        Output: 4
        Explanation: 9 exists in numbers and its index is 4
        Example 2:
        Input: numbers = [-1,0,3,5,9,12], target = 2
        Output: -1
        Explanation: 2 does not exist in numbers so return -1*/
class BinarySearch {
    public static int search(int[] numbers, int target) {
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
        return -1;
    }
    public static void main(String[] args) {
        int[]numbers = {-1,0,3,5,9,12};
        int target = 0;

        int index = search(numbers, target);
        System.out.println(index);
    }
}
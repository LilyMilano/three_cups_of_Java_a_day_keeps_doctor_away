package LeetCode.Arrays;
import java.util.Arrays;
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArray = new int[m + n];
        int index1 = 0, index2 = 0, mergedIndex = 0;

        while(index1 < m && index2 < n) {
            mergedArray[mergedIndex++] = nums1[index1] <= nums2[index2] ?
                    nums1[index1++] : nums2[index2++];
        }
        while(index1 < m){
            mergedArray[mergedIndex++] = nums1[index1++];
        }
        while (index2 < n) {
            mergedArray[mergedIndex++] = nums2[index2++];
        }
        System.arraycopy(mergedArray, 0, nums1, 0, m + n);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m =  3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Output: " + Arrays.toString(nums1));
        // Output: [1, 2, 2, 3, 5, 6]
    }
}

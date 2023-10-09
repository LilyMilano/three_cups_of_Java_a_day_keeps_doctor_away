package LeetCode.Arrays;
import java.util.Arrays;
public class SortByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0; //pointer for placing the even elements

        // Iterate through the array
        for(int currentPointer = 0; currentPointer < nums.length; currentPointer++) {
            if(nums[currentPointer] % 2 == 0) {
                // Swap even element to the evenPointer position
                int elementToSwap = nums[evenPointer];
                nums[evenPointer] = nums[currentPointer];
                nums[currentPointer] = elementToSwap;
                evenPointer++;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[]nums = {3, 1, 2, 4};
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));    // [2, 4, 3, 1]
    }
}

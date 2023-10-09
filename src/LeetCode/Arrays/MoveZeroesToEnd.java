package LeetCode.Arrays;
import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void moveZeroes(int [] nums){
        int nonZeroPointer = 0; // pointer for placing the non-zero elements

        // Iterate through the array
        for(int currentPointer = 0; currentPointer< nums.length; currentPointer++){
            if(nums[currentPointer] != 0){
                // Swap non-zero element to the nonZeroPointer position
                int elementToSwap = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[currentPointer];
                nums[currentPointer] = elementToSwap;

                // Increment the left pointer
                nonZeroPointer++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));    // [1, 3, 12, 0, 0]
    }
}



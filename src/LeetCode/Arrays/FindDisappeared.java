package LeetCode.Arrays;
import java.util.ArrayList;
import java.util.List;
public class FindDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums){
        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            // If the value at index is positive, make it negative to mark as visited
            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }
        // Iterate through the array again and add all indices which have positive values to the result list
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + missingNumbers); // Missing numbers: [5, 6]
    }
}

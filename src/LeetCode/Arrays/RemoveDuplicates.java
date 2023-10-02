package LeetCode.Arrays;
import java.util.Arrays;
public class RemoveDuplicates {
    public int removeDuplicates(int [] nums){
        int k = 0;

        for( int j = 1; j < nums.length; j++){
            if(nums[j] != nums[k]){  // k = j- 1
                k++;
                nums[k] = nums[j];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicates remove = new RemoveDuplicates();
        int k = remove.removeDuplicates(nums);

        System.out.printf("Array: %s%n", Arrays.toString(Arrays.copyOf(nums,
                k + 1)));
        System.out.printf("Number of elements: %d%n", k + 1);
    }
}

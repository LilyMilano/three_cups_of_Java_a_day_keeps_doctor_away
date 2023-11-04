package LeetCode.Problems;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 0, 5, 1};
        boolean solution = containsDuplicate(nums);
        System.out.println(solution);    // true
    }
}

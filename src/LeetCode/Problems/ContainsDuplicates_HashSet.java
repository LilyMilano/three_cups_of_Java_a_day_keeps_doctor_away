package LeetCode.Problems;
import java.util.HashSet;

public class ContainsDuplicates_HashSet {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 0, 5, 1};
        boolean solution = containsDuplicate(nums);
        System.out.println(solution);    // true
    }
}

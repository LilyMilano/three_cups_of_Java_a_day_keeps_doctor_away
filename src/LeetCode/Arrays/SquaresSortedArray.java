package LeetCode.Arrays;
import java.util.Arrays;

public class SquaresSortedArray {
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> num*num).sorted().toArray();
    }

    public static void main(String[] args){
        int[] nums = {-4, -1, 0, 3, 10};
        int[] squaredArray = sortedSquares(nums);
        System.out.println(Arrays.toString(squaredArray));
    }

    /*Output:
    [0, 1, 9, 16, 100]*/
}

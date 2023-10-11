package LeetCode.Arrays;
import java.util.Arrays;
public class HeightChecker {
    public static int heightChecker(int [] heights){
        // Initialize a counter for each heights[i] != expected[i]
        int count = 0;
        int [] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println("Number of indices where heights[i] != " +
                "expected[i]: " + heightChecker(heights));
    }
}

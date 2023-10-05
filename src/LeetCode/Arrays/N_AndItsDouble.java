package LeetCode.Arrays;
import java.util.HashSet;
import java.util.Set;

public class N_AndItsDouble {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if(set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean result = checkIfExist(arr);
        System.out.println(result);    // Output: true

        int[] arr2 = {3, 1, 7, 11};
        boolean result2 = checkIfExist(arr2);
        System.out.println(result2);    // Output: false
    }
}

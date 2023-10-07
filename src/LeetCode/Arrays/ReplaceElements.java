package LeetCode.Arrays;
import java.util.Arrays;

public class ReplaceElements {

    public static int[] replaceElements(int[] arr){

        int length = arr.length;
        int maxSoFar = -1;

        for(int i = length - 1; i >= 0; i--){
            int currentElement = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(currentElement,   maxSoFar);
        }
        return  arr;
    }

    public static void main(String[] args) {
        int [] arr = {17, 18, 5, 4, 6, 1};
        int [] result = replaceElements(arr);
        System.out.println("Output: " + Arrays.toString(result));
        // Output: [18, 6, 6, 6, 1, -1]
    }
}

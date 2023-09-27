package LeetCode.Arrays;

public class NumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            int digitsCount = 0;
            while(num != 0) {
                num /= 10;
                digitsCount++;
            }
            if(digitsCount % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896};
        int evenDigitsCount = findNumbers(nums);
        System.out.println("Number of elements with even digits: " + evenDigitsCount);
    }

    /*Output:
    Number of elements with even digits: 2*/
}

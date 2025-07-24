package DSA.Leetcode.Leetcode;

import java.util.Arrays;

public class Leetcode_66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i] + carry;
                break;
        }else{
            digits[i] = 0;
        }
        if(i == 0 && digits[i] == 0){
            int[] result = new int[n + 1];
            result[i] = carry;
            //System.out.println(result);
            return result;
        }
    }
        return digits;
    }
    public static void main(String[] args) {
        int[] a = new int[]{9,9,9,9};
        int[] result = plusOne(a);
        System.out.println(Arrays.toString(result));
    }

}

package DSA.Leetcode.Leetcode;

public class Leetcode_268 {
    public static int missingNumber(int[] nums) {
    int arraySum = 0;
    int totalSum = 0;
    int n = nums.length;
    for(int i = 0; i<nums.length; i++){
        arraySum += nums[i];
    }
    totalSum = (n * (n+1)) / 2;
    int missingNumber = totalSum - arraySum;
    System.out.println(missingNumber);
    return missingNumber;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,6,4,2,3,5,7,0,1};
        missingNumber(arr);
    }
}

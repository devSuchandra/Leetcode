package DSA.Leetcode.Leetcode;

import java.util.HashMap;

public class Leetcode_1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                arr[0] = map.get(value);
                arr[1] = i;
            }
            map.put(nums[i], i);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        twoSum(arr, 6);
    }

}

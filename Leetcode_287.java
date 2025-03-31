package DSA.Leetcode.Leetcode;

import java.util.HashMap;

public class Leetcode_287 {
    public static  int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        for(int num : nums){
            if(map.get(num) > 1){
                System.out.println(num);
                return num;
            }
        }
        System.out.println(0);
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,2};
        findDuplicate(arr);
    }

}

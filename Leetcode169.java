package DSA.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i] , value+1);
        }
        for (Map.Entry<Integer,Integer> mp: map.entrySet()) {
            if(mp.getValue() > nums.length/2){
                System.out.println(mp.getKey());
                return  mp.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3};
        majorityElement(arr);
    }
}

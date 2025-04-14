package DSA.Leetcode.Leetcode;

import java.util.HashMap;

public class Leetcode_219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int cal = Math.abs(i - map.get(nums[i]));
                if( cal <= k){
                    return true;
                }else{
                    map.put((nums[i]), i);//replacing the new value or new index with the previous one
                }
            }
            map.put((nums[i]), i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,2,3};
        containsNearbyDuplicate(arr, 2);
    }

}

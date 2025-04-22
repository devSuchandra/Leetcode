package DSA.Leetcode.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        intersect(a, b);
    }
}

package DSA.Leetcode.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums1.length; i++){
            map.put(nums1[i], 1);
        }
        for(int i = 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) == 1){
                list.add(nums2[i]);
                map.put(nums2[i], 0);
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        for(int i = 0; i<list.size(); i++){
        System.out.print(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,2,1};
        int[] arr2 = new int[]{2,2};
        intersection(arr1, arr2);
    }
}

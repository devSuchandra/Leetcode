package DSA.Leetcode.Leetcode;

import java.util.HashMap;

public class Leetcode_2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                System.out.println(nums2[j]);
                return nums2[j];
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println("-1");
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4};
        int[] arr2 = new int[]{1,2};
        getCommon(arr1, arr2);
    }
}

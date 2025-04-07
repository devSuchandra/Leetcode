package DSA.Leetcode.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            sort(nums, i, i - 1);
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        System.out.println(list);
        return list;
    }
    public static void sort(int[] arr, int first, int last ){
        boolean swapped;
        for(int i = 0; i<arr.length; i++){//[1,2,5,2,3]
            swapped = false;
            for(int j = 1; j <= arr.length - i -1; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }               
            }
            if(swapped == false){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,2,3};
        targetIndices(arr, 2);
    }

}

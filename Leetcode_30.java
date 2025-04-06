package DSA.Leetcode.Leetcode;

public class Leetcode_30 {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length - 1;
        int[] result = new int[2];
        int firstOccurance = firstIndex(nums, 0, n,target);
        int lastOccurance = lastIndex(nums, 0, n,target);
        result[0] = firstOccurance;
        result[1] = lastOccurance;
        return result;
    }
    public static int firstIndex(int[] arr, int start, int end,int target){
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                result = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return  result;
    }
    public static int lastIndex(int[] arr, int start, int end,int target){
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                result = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] a= new int[]{};
        searchRange(a, 0);
    }
}

package DSA.Leetcode.Leetcode;

public class Leetcode_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        a[0] = firstOccurance(0, nums.length - 1,target, nums);
        a[1] = lastOccurance(0, nums.length - 1, target, nums);

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        return a;
    }
    public static int firstOccurance(int start, int end, int x, int[] num){
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(num[mid] == x){
                result = mid;
                end = mid - 1;
            }else if(num[mid] < x) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return result;
    }
    public static int lastOccurance(int start, int end, int x, int[] num){
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
        if(num[mid] == x){
            result = mid;
            start = mid + 1;
        }else if(num[mid] < x){
            start = mid + 1;
        }else{
            end = mid - 1;
        }      
    }
    return result;
}
public static void main(String[] args) {
    int[] arr = new int[]{5,7,7,8,8,10};
    searchRange(arr, 8);
}
}


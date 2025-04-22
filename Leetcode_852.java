package DSA.Leetcode.Leetcode;

public class Leetcode_852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(start);
        return start;
        
    }
    public static void main(String[] args) {
        int[] a = new int[]{0,10,5,2};
        peakIndexInMountainArray(a);
    }

}

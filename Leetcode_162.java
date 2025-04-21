package DSA.Leetcode.Leetcode;

public class Leetcode_162 {
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] > nums[mid + 1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,2,1};
        findPeakElement(arr);
    }

}

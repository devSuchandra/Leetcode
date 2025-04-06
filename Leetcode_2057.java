package DSA.Leetcode.Leetcode;

public class Leetcode_2057 {
    public static int smallestEqual(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(i % 10 == nums[i]){
                System.out.println(i);
                  return i;
              }

        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        smallestEqual(arr);
    }

}

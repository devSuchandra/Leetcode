package DSA.Leetcode.Leetcode;

public class Leetcode_2529 {
      public static int maximumCount(int[] nums) {
          int pc = positiveCount(0, nums.length - 1, nums);
          int nc = negativeCount(0, nums.length - 1, nums);
          int max = Math.max(pc,nc);
          System.out.println(max);
        return max;
    }
     public static int positiveCount(int start, int end, int[] num){
         int positivecount = num.length;
         while(start <= end){
             int mid = start + (end - start)/2;
              if(num[mid] > 0){
                 positivecount = mid;
                 end = mid - 1;
             }else{
                  start = mid + 1;
              }
         }int result = num.length - positivecount;
         return result;
     }
    public static int negativeCount(int start, int end, int[] num){
        int negativeCount = num.length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(num[mid] >= 0){
                negativeCount = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return negativeCount;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2,-1,-1,1,2,3};
        maximumCount(arr);
    }
}

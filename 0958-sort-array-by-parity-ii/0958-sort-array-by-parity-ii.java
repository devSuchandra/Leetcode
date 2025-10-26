class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;//even index
        int j = 1;//odd index
        int n = nums.length;
        while(i < n  && j < n){
            if(nums[i] % 2 == 0){
            i += 2;
        }else if(nums[j] % 2 != 0){
            j += 2;
        }else{
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
      }
        return nums;
    }
}
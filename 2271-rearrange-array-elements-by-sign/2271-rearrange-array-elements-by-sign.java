class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi = 0;//for positive number
        int ni = 1;//for negative number
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0 && pi < nums.length){
                result[pi] = nums[i];
                pi += 2;
            }else if(nums[i] < 0 && ni < nums.length){
                result[ni] = nums[i];
                ni += 2;
            }
        }
        return result;
    }
}
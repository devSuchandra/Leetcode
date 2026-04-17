class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        for(int i = 0; i<nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            // if(i >0 && nums[i] == nums[i - 1]){
            //     continue;
            // }
            while(start < end){
                if(nums[i] + nums[start] + nums[end] < 0){
                    start++;
                }else if(nums[i] + nums[start] + nums[end] > 0){
                    end--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    result.add(temp);
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
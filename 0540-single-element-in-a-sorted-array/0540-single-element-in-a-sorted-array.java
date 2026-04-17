class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 2;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums.length == 3){
                if(nums[mid] == nums[mid - 1]){
                    return nums[mid + 1];
                }else{
                    return nums[mid - 1];
                }
            }
            if(mid % 2 == 0){
                if(nums[mid] == nums[mid - 1]){
                    end = mid - 1;
                }else if(nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                }else{
                    return nums[mid];
                }
            }
            if(mid % 2 != 0){
                if(nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }
                else if(nums[mid] == nums[mid + 1]){
                    end = mid - 1;
                }
                else{
                    return nums[mid];
                }
            }
        }
        return -1;
    }
}
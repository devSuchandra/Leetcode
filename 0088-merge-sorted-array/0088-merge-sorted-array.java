class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int start1 = m - 1,start2 = n - 1, i = m + n - 1;
        while(start1 >= 0 && start2 >= 0){//s1 = 2, s2=2, i = 5
            if(nums1[start1] > nums2[start2]){
                nums1[i] = nums1[start1];
                start1--;
                i--;
            }else{
                nums1[i] = nums2[start2];
                start2--;
                i--;
            }
        }
        
        while(start2 >= 0){
            nums1[i] = nums2[start2];
            start2--;
            i--;
        } 
    }
}
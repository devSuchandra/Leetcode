class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1,
        maxArea = 0;

        while(start < end){
            int area = Math.min(height[start], height[end]) * Math.abs(start - end);
            //minHeightOfBar * width

            maxArea = Math.max(maxArea, area);

            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}
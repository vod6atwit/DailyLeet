class Solution {
    public int trap(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[left];
        int maxRight = height[right];

        while(left < right){
            if(maxLeft <= maxRight){
                left++;
                result += (maxLeft - height[left] < 0) ? 0 : maxLeft - height[left];
                if(height[left] > maxLeft){
                    maxLeft = height[left];
                }
            }else{
                right--;
                result += (maxRight - height[right] < 0 ? 0 : maxRight - height[right]);
                if(height[right] > maxRight){
                    maxRight = height[right];
                }
            }
        }

        return result;
    }
}


// two pointers problem


// Runtime : 0ms - Beats: 100.00%
// Memory : 46.70MB - Beats: 10.08%
// Link submission: https://leetcode.com/problems/trapping-rain-water/submissions/1157617105/
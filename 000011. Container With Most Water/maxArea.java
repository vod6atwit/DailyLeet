class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        
        int result = -1;
        while(i < j){
            if(height[i] < height[j]){
                result = Math.max(height[i] * (j-i),result);
                i++;
            }
            if(height[i] >= height[j]){
                result = Math.max(height[j] * (j-i), result);
                j--;
            }
        }
        return result;
    }
}

// 0 1 2 3 4 5 6 7 8 
// 1 8 6 2 5 4 8 3 7
// i               j

// if h[i] < h[j] -> move i++
// if h[i] >= h[j] -> calc result = max(h[j] * (j-i),result), then move j--


// Runtime : 4ms - Beats: 88.30%
// Memory : 56.01MB - Beats: 69.70%
// Link submission: https://leetcode.com/problems/container-with-most-water/submissions/1103683828/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // array to hold the sum of the product prefix index but not include the index
        int[] pre = new int[n];
        // array to hold the sum of the product suffix index but not include the index
        int[] suff = new int[n];
        
        pre[0] = 1;
        suff[n-1] = 1;

        // fill out prefix array 
        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1] * nums[i-1];
        }

        // fill out suffix array
        for(int i = n - 2; i >=0; i--){
            suff[i] = suff[i+1] * nums[i+1];
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = pre[i] * suff[i];
        }

        return ans;
    }
}


// Runtime : 2ms - Beats: 70.50%
// Memory : 53.57MB - Beats: 33.52%
// Link submission: https://leetcode.com/problems/product-of-array-except-self/submissions/1071288325/
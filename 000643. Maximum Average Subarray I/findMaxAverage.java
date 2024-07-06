class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cur = 0;
        for(int i = 0; i < k; i++){
            cur += nums[i];
        }
        
        double res = (double)cur/k;
        
        for(int right = k; right < nums.length; right++){
            cur += (nums[right] - nums[right - k]);
            res = Math.max(res, (double)cur/k);
        }
        return res;
    }
    
}
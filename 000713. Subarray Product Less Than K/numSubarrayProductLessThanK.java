class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int left = 0;
        int res = 0;
        int product = 1;

        for(int right = 0; right < nums.length; right++){
            product *= nums[right];
            while(product >= k){
                product /= nums[left];
                left++;
            }
            res += right - left + 1;

        }
        return res;
        
    }
}

// [10,5,2,6]
//     i
//         j
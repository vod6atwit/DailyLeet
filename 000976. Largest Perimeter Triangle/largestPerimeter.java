class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 3; i >= 0; i--){
            if(nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }
}

// we need 3 number a b c to make a triangle
// after sorting the array
// to be a triangle , b = c => a + b > c
// we go from the largest to smallest number
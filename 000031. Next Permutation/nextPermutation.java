class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length;

        int pivot_index = size - 1;
        while(pivot_index >= 1 && nums[pivot_index] <= nums[pivot_index - 1]){
            pivot_index--;
        }

        if(pivot_index != 0){
            int i = size - 1;
            while(nums[i] <= nums[pivot_index - 1]){
                i--;
            }
            swap(nums, i, pivot_index - 1);
        }

        int left = pivot_index;
        int right = size - 1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int pivot_index){
        int temp = nums[i];
        nums[i] = nums[pivot_index];
        nums[pivot_index] = temp;
    }
}
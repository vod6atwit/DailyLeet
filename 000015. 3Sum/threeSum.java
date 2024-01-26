class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> myList;
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right -= 1;
                }else if(sum < 0){
                    left += 1;
                }else if(sum == 0){
                    myList = new ArrayList<>();
                    myList.add(nums[i]);
                    myList.add(nums[left]);
                    myList.add(nums[right]);
                    result.add(myList);

                    left += 1;
                    while(nums[left] == nums[left -1] && left < right){
                        left += 1;
                    }
                }
            }
            
        }

        return result;
    }
}

// -1,0,1,2,-1,-4
// -4,-1,-1,0,1,2

// Runtime : 27ms - Beats: 90.46%
// Memory : 52.16MB - Beats: 22.70%
// Link submission: https://leetcode.com/problems/3sum/submissions/1117642933/
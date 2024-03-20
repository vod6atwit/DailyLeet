
import static java.lang.Math.nextDown;

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length == 0) {
            result.add(Arrays.asList(lower, upper));
            return result;
        }

        int cur_lower = nums[0];

        if (lower < cur_lower) {
            result.add(Arrays.asList(lower, cur_lower - 1));
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] - nums[i] <= 1){
                continue;
            }
            result.add(Arrays.asList(nums[i] + 1, nums[i+1] - 1));
        }

        if(nums[nums.length - 1] < upper){
            result.add(Arrays.asList(nums[nums.length - 1] + 1, upper));
        }
        return result;
    }
}
//        i
//        0,1,3,50,75              

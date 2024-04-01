class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        while (right < nums.length) {
            if (nums[right] == 0) {
                list.add(right);
                if (list.size() == 2) {
                    int min_index = Collections.min(list);
                    list.removeFirst();
                    left = min_index + 1;
                }
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}

// 1,0,1,1,0
// i
//         j

// [1, 4]
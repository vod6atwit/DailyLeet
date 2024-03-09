class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> memo = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] % value;
            if (nums[i] < 0) {
                nums[i] += value;
            }
            memo.put(nums[i], memo.getOrDefault(nums[i], 0) + 1);
        }

        int i = 0;

        while(i < nums.length){
            int stop = i % value;
            if(!memo.containsKey(stop) || memo.get(stop) == 0){
                break;
            }
            memo.put(stop, memo.get(stop) - 1);
            i++;
        }
        return i;

    }
}

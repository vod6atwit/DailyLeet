class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> ans = new ArrayList<>();

        int begin = toBeRemoved[0];
        int end = toBeRemoved[1];

        for (int[] interval : intervals) {
            int interval_begin = interval[0];
            int interval_end = interval[1];

            if (interval_begin > end || interval_end < begin) {
                ans.add(Arrays.asList(interval_begin, interval_end));
            } 
            if (interval_begin < begin && interval_end > begin) {
                ans.add(Arrays.asList(interval_begin, begin));
            } 
            if (interval_end > end && interval_begin < end) {
                ans.add(Arrays.asList(end, interval_end));
            }
        }

        return ans;
    }

}
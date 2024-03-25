class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = Integer.MIN_VALUE;
        int cur_min = arrays.get(0).get(0);
        int cur_max = arrays.get(0).get(arrays.get(0).size() - 1);

        for(int i = 1; i < arrays.size(); i++){
            List<Integer> list = arrays.get(i);
            int min = list.get(0);
            int max = list.get(list.size() - 1);

            result = Math.max(result, Math.max(max - cur_min, cur_max - min));     
            cur_min = Math.min(min, cur_min);
            cur_max = Math.max(max, cur_max);
        }

        return result;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        queue.addAll(map.entrySet());

        int size = 0;
        while (size < k && !queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            result[size] = entry.getKey();
            size++;
        }

        return result;
    }
}
class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
     
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n, 1);
            }else{
                map.put(n, map.get(n) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            int key = entry.getKey();
            if(value == 1){
                set.add(key);
            }
        }
        
        return set.isEmpty() ? -1 : Collections.max(set);
    }
}
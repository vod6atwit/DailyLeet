class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for(int i = 0; i < nums2.length; i++){
            map.put(nums2[i], i);
        }

        for(int i = 0; i < result.length; i++){
            result[i] = map.get(nums1[i]);
        }
        
    return result;

    }
}
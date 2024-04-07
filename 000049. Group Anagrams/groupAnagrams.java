class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] char_arr = strs[i].toCharArray();
            Arrays.sort(char_arr);
            String str = new String(char_arr);
            
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            } 
            map.get(str).add(strs[i]);
            
        }

        // List<List<String>> result = new ArrayList<>();
        // for(List<Integer> l : map.values()){
        //     List<String> str_list = new ArrayList<>();
        //     for(int i : l){
        //         str_list.add(strs[i]);
        //     }
        //     result.add(str_list);
        // }
        return new ArrayList<>(map.values());
    }
}
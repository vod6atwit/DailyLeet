class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strings) {
            char[] ch_arr = str.toCharArray();
            String key = "";
            for(int i = 0; i < ch_arr.length-1; i++){
                int val = (ch_arr[i+1]-ch_arr[i]) % 26;
                if(val < 0){
                    val += 26;
                }
                key += ',' + Integer.toString(val);
            }

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            List<String> list = map.get(key);
            list.add(str);
        }

        return new ArrayList<>(map.values());
    }
}
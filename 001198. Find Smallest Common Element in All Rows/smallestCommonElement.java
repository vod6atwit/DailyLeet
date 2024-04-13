class Solution {
    public int smallestCommonElement(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int[] arr: mat){
            for(int i : arr){
                if(!map.containsKey(i)){
                    map.put(i, 1);
                }else{
                    map.put(i, map.get(i) + 1);
                    if(map.get(i) >= mat.length){
                        return i;
                    }
                }
            }
        }

        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     int key = entry.getKey();
        //     int value = entry.getValue();
        //     if(value >= mat.length){
        //         return key;
        //     }
        // }
        return -1;
    }
}
class FirstUnique {
    LinkedHashMap<Integer, Integer> uniqueNumbers = new LinkedHashMap<>();;

    public FirstUnique(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(!uniqueNumbers.containsKey(nums[i])){
                uniqueNumbers.put(nums[i], 1);
            }else{
                uniqueNumbers.put(nums[i], uniqueNumbers.get(nums[i]) + 1);
            }
        }
    }
    
    public int showFirstUnique() {
        int res = -1;
        for(Integer key: uniqueNumbers.keySet()){
            // System.out.println(uniqueNumbers.get(key));
            if(uniqueNumbers.get(key) == 1){
                res = key;
                break;
            }
        }
        return res;
    }
    
    public void add(int value) {
        if(!uniqueNumbers.containsKey(value)){
            uniqueNumbers.put(value, 1);
        }else{
            uniqueNumbers.put(value, uniqueNumbers.get(value) + 1);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
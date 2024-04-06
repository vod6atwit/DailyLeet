class Solution {
    // public boolean containsDuplicate(int[] nums) {
    // List<Integer> list = new ArrayList<>();
    // for(int n : nums){
    // // use contains in ArrayList, it is o(n)
    // if(list.contains(n)){
    // return true;
    // }
    // list.add(n);
    // }
    // return false;
    // }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }
}
class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int result = 0;

        for(int i : arr){
            set.add(i);
        }

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i] + 1)){
                result += 1;
            }
        }

        return result;
    }
}
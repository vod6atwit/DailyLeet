class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int left = 0;

        for(int right = 0; right < arr.length; right++){
            res.add(arr[right]);
            if(res.size() > k){
                if(Math.abs(arr[left] - x) < Math.abs(arr[right] - x) || 
                (Math.abs(arr[left] - x) == Math.abs(arr[right] - x)) && arr[left] < arr[right]){
                    res.removeLast();
                }else{
                    res.removeFirst();
                    left++;
                }
            }
        }

        return res;
    }
}
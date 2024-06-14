class Solution {
    public int[] findPermutation(String s) {
        int[] res = new int[s.length() +1];

        Stack<Integer> stack = new Stack<>();
        int s_index = 0;
        int res_index = 0;

        while(s_index < s.length()){
            stack.push(s_index + 1);
            if(s.charAt(s_index) == 'I'){
                while(!stack.empty()){
                    res[res_index++] = stack.pop();
                }
            }
            s_index++;
        }
        
        stack.push(s_index + 1);
        while(!stack.empty()){
            res[res_index++] = stack.pop();
        }

        return res;
    }
}
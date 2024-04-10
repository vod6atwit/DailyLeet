class Solution {
    public int calculateTime(String keyboard, String word) {
        // Map<Character, Integer> map = new HashMap<>();
        // int sum = 0;

        // for(int i = 0; i < keyboard.length(); i++){
        //     map.put(keyboard.charAt(i), i);
        // }

        // int prev_index = 0;
        // for(int j = 0; j < word.length(); j++){
        //     char ch = word.charAt(j);
        //     sum += Math.abs(map.get(ch) - prev_index);
        //     prev_index = map.get(ch);
        // }

        // return sum;

        int prev_index = 0;
        int sum = 0;
        int curr_index = 0;

        for(char c: word.toCharArray()){
            prev_index = curr_index;
            curr_index = keyboard.indexOf(c);
            sum += Math.abs(curr_index - prev_index);
        }

        return sum;
    }
}

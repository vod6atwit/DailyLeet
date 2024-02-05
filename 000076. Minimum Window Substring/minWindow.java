class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0){
            return "";
        }
        int char_have = 0;
        int char_need = t.length();
        int[] result = new int[2];
        int resultLength = s.length() + 1;
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> t_string = new HashMap<>();
        int left = 0;
        int right = 0;

        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            // System.out.print(c);
            if(!t_string.containsKey(c)){
                t_string.put(c, 1);
            }else{
                t_string.put(c, t_string.get(c) + 1);
            }
            // System.out.println(" " + t_string.get(c));
        }

        while(right < s.length()){
            char c = s.charAt(right);
            // System.out.print(c);

            if(!window.containsKey(c)){
                window.put(c, 1);
            }else{
                window.put(c, window.get(c) + 1);
            }
            // System.out.println(" " + window.get(c));

            if(t_string.containsKey(c) && window.get(c) <= t_string.get(c)){
                // System.out.println("here");
                char_have += 1;
            }
            // System.out.println("char have:" + char_have);

            while(char_have == char_need){
                if((right - left + 1) < resultLength){
                    result[0] = left;
                    result[1] = right;
                    resultLength = right - left + 1;
                }
                // pop from the left of window
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                char c_left = s.charAt(left);
                if(t_string.containsKey(c_left) && window.get(c_left) < t_string.get(c_left)){
                    char_have -= 1;
                }
                left += 1;
            }
            right++;
        }

        
        return resultLength != s.length()+1 ? s.substring(result[0], result[1]+1) : "";
    }
}



// Runtime : 17ms - Beats: 44.59%
// Memory : 45.58MB - Beats: 15.35%
// Link submission: https://leetcode.com/problems/minimum-window-substring/submissions/1167245839
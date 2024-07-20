class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int res = 0;
        int maxfrequency = 0;
        int[] characters = new int[26];

        for(int right = 0; right < s.length(); right++){
            int currentChar = s.charAt(right) - 'A';
            characters[currentChar] += 1;
            maxfrequency = Math.max(maxfrequency, characters[currentChar]);

            boolean isValid = (right - left + 1) - maxfrequency <= k;
            if(!isValid){
                int removeChar = s.charAt(left) - 'A';
                characters[removeChar] -= 1;
                left++;
            }

            res = Math.max(right - left + 1, res);
          
        }

        return res;
    }
}

// "ABABC"
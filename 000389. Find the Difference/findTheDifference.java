class Solution {
    public char findTheDifference(String s, String t) {
        int num = 0;
        char[] s_charArray = s.toCharArray();
        char[] t_charArray = t.toCharArray();

        for(int i = 0; i < t_charArray.length; i++){
            num += t_charArray[i];
        }

        for(int j = 0; j < s_charArray.length; j++){
            num -= s_charArray[j];
        }

        return (char) num;
    }
}
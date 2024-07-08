class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int word_index = 0;
        int abbr_index = 0;

        while(word_index < word.length() && abbr_index < abbr.length()){
            Character w = word.charAt(word_index);
            Character a = abbr.charAt(abbr_index);
            if(Character.isLetter(a) && a != w){
                return false;
            }else if(Character.isDigit(a)){
                int num = a - '0';
                if(num == 0){
                    return false;
                }
                while(abbr_index + 1 < abbr.length() && Character.isDigit(abbr.charAt(abbr_index + 1))){
                    num *= 10 + (abbr.charAt(abbr_index + 1) - '0');
                    abbr_index++;
                }
                while(num != 1){
                    word_index++;
                    num--;
                }
            }
            word_index++;
            abbr_index++;
        }

        return word_index == word.length() && abbr_index == abbr.length();
    }
}
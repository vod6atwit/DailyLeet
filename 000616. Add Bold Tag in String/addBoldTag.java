class Solution {
    public String addBoldTag(String s, String[] words) {
        int size = s.length();
        boolean[] bold = new boolean[size];

        for(String word: words){
            int start = s.indexOf(word);
            while(start != -1){
                for(int i = start; i < start + word.length(); i++){
                    bold[i] = true;
                }

                start = s.indexOf(word, start + 1);
            }
        }

        String open = "<b>";
        String close = "</b>";
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < size; i++){
            if(bold[i] && (i == 0 || !bold[i-1])){
                ans.append(open);
            }

            ans.append(s.charAt(i));

            if(bold[i] && (i == size - 1 || !bold[i+1])){
                ans.append(close);
            }
        }

        return ans.toString();
    }
}
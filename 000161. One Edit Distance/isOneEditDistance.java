class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.equals(t)){
            return false;
        }
        int index = 0;
        if(s.length() == t.length()){
            int dif = 0;
            while(index < s.length()){
                if(t.charAt(index) != s.charAt(index)){
                    dif += 1;
                }
                index++;
            }
            return dif == 1;
        }else if(s.length() == t.length() - 1){
            return isSub(s,t);
        }else if(s.length() == t.length() + 1){
            return isSub(t,s);
        }
        return false;
        
    }

    // ab
    //   i
    // acb
    //    j
    public boolean isSub(String s1, String s2){
        int i = 0; // for shorter string
        int j = 0; // for longer string

        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
}

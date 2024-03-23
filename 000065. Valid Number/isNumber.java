class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenExponent = false;
        boolean seenDot = false;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                seenDigit = true;
            }else if(ch == '+' || ch == '-'){
                // if the sign is in second position but the prev one is not an exponent , return false
                if(i > 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')){
                    return false;
                }
            }else if(ch == 'E' || ch == 'e'){
                if(seenExponent || !seenDigit){
                    return false;
                }
                seenExponent = true;
                seenDigit = false;
            }else if(ch == '.'){
                if(seenExponent || seenDot){
                    return false;
                }
                seenDot = true;
            }else{
                return false;
            }
        }
        return seenDigit;

    }
}
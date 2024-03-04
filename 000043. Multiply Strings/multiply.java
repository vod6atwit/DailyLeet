class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        StringBuilder n1 = new StringBuilder(num1);
        StringBuilder n2 = new StringBuilder(num2);
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        n1.reverse();
        n2.reverse();

        int size = n1.length() + n2.length();
        for(int i = 0; i < size; i++){
            sb.append(0);
        }

        for(int i = 0; i < n2.length(); i++){
            int num2_digit = n2.charAt(i) - '0';
            for(int j = 0; j < n1.length(); j++){
                int currentPosition = i+j;
                int num1_digit = n1.charAt(j) - '0';
                int currentPosition_digit = sb.charAt(currentPosition) - '0';
                
                int res = ((num1_digit * num2_digit) + currentPosition_digit) % 10;
                carry = ((num1_digit * num2_digit) + currentPosition_digit) / 10 + (sb.charAt(currentPosition + 1) - '0');

                sb.setCharAt(currentPosition, (char)(res + '0'));
                sb.setCharAt(currentPosition + 1, (char)(carry + '0'));
                
            }
        }
        // if there is a zero left, remove it
        if(sb.charAt(sb.length() - 1) == '0'){
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }
}
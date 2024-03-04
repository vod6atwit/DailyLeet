class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int n = num1.length() - 1;
        int m = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while(n >= 0 || m >= 0){
            int num1_digit = n >= 0 ? num1.charAt(n) - '0' : 0;
            int num2_digit = m >= 0 ? num2.charAt(m) - '0' : 0;
            int res = (num1_digit + num2_digit + carry) % 10;
            carry = (num1_digit + num2_digit + carry) / 10; 

            sb.append(res);
            n--;
            m--;
        }

        if(carry == 1) sb.append('1');
        sb.reverse();
        return sb.toString();

    }
}
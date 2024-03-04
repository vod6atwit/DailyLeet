class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;

        int n = num.length - 1;

        while(n >= 0 || k > 0){
            int num1_digit = n >= 0 ? num[n] : 0;
            int num2_digit = k % 10;
            int res = (num1_digit + num2_digit + carry) % 10;
            carry = (num1_digit + num2_digit + carry) /10;

            result.add(res);
            n--;
            k = k > 0 ? k /= 10 : 0;
        }
        if(carry == 1) result.add(1);

        return result.reversed();
    }
}
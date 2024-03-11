class Solution {
    public double myPow(double x, int n) {
        long num = n;
        if(num == 0) return 1;
        if(num < 0){
            num = -1 * num;
            x = 1.0/x;
        }
        
        double result = 1;
        while(num != 0){
            if(num % 2 == 1){
                result *= x;
                num -= 1; // make it even
            }

            x = x * x;
            num = num/2;
        }

        return result;
    }
}

// (x^2) ^ n/2 if n is even
// x * (x^2) ^ (n-1)/2 if n is odd
// you have to multiply result with (x^2) all the time
// except if n is odd, then you decrease n by 1 to make it even
// and multiply result with another x
class Solution {
    public int kthFactor(int n, int k) {
        // List<Integer> list = new ArrayList<>();
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // list.add(i);
        // }
        // }

        // int size = list.size();
        // if (k > size)
        // return -1;
        // return list.get(k - 1);

        List<Integer> divisors = new ArrayList();

        // the size of all the factor of a number always even (as a paired)
        // except if the number is perfect square, then the size will be odd
        // with 1 number in the middle
        // [1,2,3,4,6,9,12,18,36]
        
        // so we only need to check sqrt(n), 
        // if we can not find the k index in the range from 0 -> sqrt(N)
        // Then we can find the paired of it by using this formular
        // N / list_of_factor[length of it] - k 

        int sqrtN = (int) Math.sqrt(n);
        for (int x = 1; x < sqrtN + 1; ++x) {
            if (n % x == 0) {
                --k;
                divisors.add(x);
                if (k == 0) {
                    return x;
                }
            }
        }

        // If n is a perfect square
        // we have to skip the duplicate
        // in the divisor list
        if (sqrtN * sqrtN == n) {
            ++k;
        }
        // [1,2,3,4,6]
   

        int nDiv = divisors.size();
        return (k <= nDiv) ? n / divisors.get(nDiv - k) : -1;
    }
}
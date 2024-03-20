class Solution {
    public boolean confusingNumber(int n) {
        Map<Integer, Integer> valid = new HashMap<>();
        int result = 0;
        int num = n;
        valid.put(0, 0);
        valid.put(1, 1);
        valid.put(6, 9);
        valid.put(8, 8);
        valid.put(9, 6);

        while (num / 10 > 0) {
            int value = num % 10; // 9
            num = num / 10; // 8
            if (valid.containsKey(value)) {
                result = result * 10 + valid.get(value);
                continue;
            } else {
                return false;
            }
        }

        if (valid.containsKey(num)) {
            result = result * 10 + valid.get(num);
        } else {
            return false;
        }

        return (result != n);
    }
}
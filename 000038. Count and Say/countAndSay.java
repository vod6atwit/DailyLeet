class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        return "" + rle(countAndSay(n - 1));
    }

    public String rle(String str) {
        String res = "";
        int count = 1;
        int i = 0;
        while (i < str.length()) {
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            res += Integer.toString(count) + str.charAt(i);
            i++;
            count = 1;
        }
        return res;
    }
}

// countAndSay(4) = "" + countAndSay(3);
// countAndSay(3) = "" + countAndSay(2);
// countAndSay(2) = "11";
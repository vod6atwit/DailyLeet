# [1100. Find K-Length Substrings With No Repeated Characters](https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/description/?envType=study-plan-v2&envId=premium-algo-100)

Given a string `s` and an integer `k`, return the number of substrings in `s` of length `k` with no repeated characters.

**Example 1:** 

```
Input: s = "havefunonleetcode", k = 5
Output: 6
Explanation: There are 6 substrings they are: 'havef','avefu','vefun','efuno','etcod','tcode'.
```

**Example 2:** 

```
Input: s = "home", k = 5
Output: 0
Explanation: Notice k can be larger than the length of s. In this case, it is not possible to find any substring.
```

**Constraints:** 

- `1 <= s.length <= 10^4`
- `s` consists of lowercase English letters.
- `1 <= k <= 10^4`
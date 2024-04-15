# [531. Lonely Pixel I](https://leetcode.com/problems/lonely-pixel-i/description/?envType=study-plan-v2&envId=premium-algo-100)

Given an `m x n` `picture` consisting of black `'B'` and white `'W'` pixels, return the number of <b>black</b> lonely pixels.

A black lonely pixel is a character `'B'` that located at a specific position where the same row and same column don't have **any other**  black pixels.

**Example 1:** 
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/11/pixel1.jpg" style="width: 242px; height: 242px;">

```
Input: picture = [["W","W","B"],["W","B","W"],["B","W","W"]]
Output: 3
Explanation: All the three 'B's are black lonely pixels.
```

**Example 2:** 
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/11/pixel2.jpg" style="width: 242px; height: 242px;">

```
Input: picture = [["B","B","B"],["B","B","W"],["B","B","B"]]
Output: 0
```

**Constraints:** 

- `m ==picture.length`
- `n ==picture[i].length`
- `1 <= m, n <= 500`
- `picture[i][j]` is `'W'` or `'B'`.
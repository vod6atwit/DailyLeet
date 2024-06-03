# [252. Meeting Rooms](https://leetcode.com/problems/meeting-rooms/description/?envType=study-plan-v2&envId=premium-algo-100)

Given an array of meeting time `intervals`where `intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]`, determine if a person could attend all meetings.

**Example 1:** 

```
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
```

**Example 2:** 

```
Input: intervals = [[7,10],[2,4]]
Output: true
```

**Constraints:** 

- `0 <= intervals.length <= 10^4`
- `intervals[i].length == 2`
- `0 <= start<sub>i</sub> <end<sub>i</sub> <= 10^6`
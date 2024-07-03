# [1429. First Unique Number](https://leetcode.com/problems/first-unique-number/description/?envType=study-plan-v2&envId=premium-algo-100)

You have a queue of integers, you need to retrieve the first unique integer in the queue.

Implement the `FirstUnique`class:

- `FirstUnique(int[] nums)` Initializes the object with the numbers in the queue.
- `int showFirstUnique()`returns the value of **thefirst unique**  integer of the queue, and returns **-1**  if there is no such integer.
- `void add(int value)`insert valuetothe queue.

**Example 1:** 

```
<b>Input: </b>
["FirstUnique","showFirstUnique","add","showFirstUnique","add","showFirstUnique","add","showFirstUnique"]
[[[2,3,5]],[],[5],[],[2],[],[3],[]]
<b>Output: </b>
[null,2,null,2,null,3,null,-1]
<b>Explanation: </b>
FirstUnique firstUnique = new FirstUnique([2,3,5]);
firstUnique.showFirstUnique(); // return 2
firstUnique.add(5);            // the queue is now [2,3,5,5]
firstUnique.showFirstUnique(); // return 2
firstUnique.add(2);      // the queue is now [2,3,5,5,2]
firstUnique.showFirstUnique(); // return 3
firstUnique.add(3);      // the queue is now [2,3,5,5,2,3]
firstUnique.showFirstUnique(); // return -1
```

**Example 2:** 

```
<b>Input: </b>
["FirstUnique","showFirstUnique","add","add","add","add","add","showFirstUnique"]
[[[7,7,7,7,7,7]],[],[7],[3],[3],[7],[17],[]]
<b>Output: </b>
[null,-1,null,null,null,null,null,17]
<b>Explanation: </b>
FirstUnique firstUnique = new FirstUnique([7,7,7,7,7,7]);
firstUnique.showFirstUnique(); // return -1
firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
firstUnique.add(3);      // the queue is now [7,7,7,7,7,7,7,3]
firstUnique.add(3);      // the queue is now [7,7,7,7,7,7,7,3,3]
firstUnique.add(7);      // the queue is now [7,7,7,7,7,7,7,3,3,7]
firstUnique.add(17);     // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
firstUnique.showFirstUnique(); // return 17
```

**Example 3:** 

```
<b>Input: </b>
["FirstUnique","showFirstUnique","add","showFirstUnique"]
[[[809]],[],[809],[]]
<b>Output: </b>
[null,809,null,-1]
<b>Explanation: </b>
FirstUnique firstUnique = new FirstUnique([809]);
firstUnique.showFirstUnique(); // return 809
firstUnique.add(809);          // the queue is now [809,809]
firstUnique.showFirstUnique(); // return -1
```

**Constraints:** 

- `1 <= nums.length <= 10^5`
- `1 <= nums[i] <= 10^8`
- `1 <= value <= 10^8`
- At most `50000`calls will be made to `showFirstUnique`and `add`.
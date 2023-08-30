/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    // HashMap<ListNode, ListNode> memo = new HashMap<>();
    // while(head != null){
    // if(memo.containsKey(head)){
    // break;
    // }
    // memo.put(head, head.next);
    // head = head.next;
    // }

    // if(head == null){
    // return false;
    // }
    // return true;

    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}

// the distance between slow and fast is 10
// if slow increasing by 1
// then fast increasing by 2
// so the distance between slow and fast is decreasing by 1
// if the distance is 0, then it is a cycle (the worst case is the lengh of the
// linked list)

// Runtime : 0 ms - Beats: 100%
// Memory : 44.3 MB - Beats: 6.3%
// Link submission:
// https://leetcode.com/problems/linked-list-cycle/submissions/1036322013/
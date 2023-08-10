/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    if (list1.val <= list2.val) {
      return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
    } else {
      return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
    }
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 41.2 MB - Beats: 87.63%
// Link submission:
// https://leetcode.com/problems/merge-two-sorted-lists/submissions/1017543326/
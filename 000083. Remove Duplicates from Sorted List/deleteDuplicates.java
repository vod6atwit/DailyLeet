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
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode new_head = new ListNode(head.val);
    ListNode dumpHead = new_head;

    while (head != null) {
      if (head.val != dumpHead.val) {
        ListNode newNode = new ListNode(head.val);
        dumpHead.next = newNode;
        dumpHead = dumpHead.next;
      }
      head = head.next;
    }

    return new_head;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 43.1 MB - Beats: 51.92%
// Link submission:
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1024282211/

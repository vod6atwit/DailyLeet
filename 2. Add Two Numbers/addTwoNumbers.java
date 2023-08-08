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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode head = new ListNode(0);
    ListNode dumpHead = head;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int l1_val = l1 != null ? l1.val : 0;
      int l2_val = l2 != null ? l2.val : 0;

      int sum = l1_val + l2_val + carry;
      int value = sum % 10;
      carry = sum / 10;

      ListNode new_node = new ListNode(value);
      dumpHead.next = new_node;
      dumpHead = dumpHead.next;

      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }

    if (carry == 1) {
      ListNode new_node = new ListNode(1);
      dumpHead.next = new_node;
    }

    return head.next;
  }
}

// Runtime : 1ms - Beats: 100%
// Memory : 42.8MB - Beats: 97.32%
// Link submission: https://leetcode.com/problems/add-two-numbers/submissions/
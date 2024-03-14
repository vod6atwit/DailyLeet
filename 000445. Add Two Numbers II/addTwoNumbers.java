/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Reverse = reverse(l1);
        ListNode l2Reverse = reverse(l2);

        // [3,4,2,7]
        // [4,6,5]
        int carry = 0;
        ListNode dumpHead = new ListNode(0);
        ListNode head = dumpHead;

        while(l1Reverse != null || l2Reverse != null){
            int l1_value = l1Reverse != null ? l1Reverse.val : 0;
            int l2_value = l2Reverse != null ? l2Reverse.val : 0;

            int sum = l1_value + l2_value + carry;
            int value = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(value);
            head.next = newNode;
            head = head.next;

            l1Reverse = l1Reverse != null ? l1Reverse.next : null;
            l2Reverse = l2Reverse != null ? l2Reverse.next : null;

        }

        if(carry == 1){
            ListNode newNode = new ListNode(1);
            head.next = newNode;
        }
        dumpHead = dumpHead.next;
        ListNode result = reverse(dumpHead);
        
        return result;
    }

    public ListNode reverse(ListNode l){
        // null  7 -> 2 -> 4 -> 3
        // pre   cur
        ListNode pre = null;
        ListNode cur = l;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }
}
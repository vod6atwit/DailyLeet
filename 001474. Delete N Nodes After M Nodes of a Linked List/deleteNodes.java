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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode res = head;
        ListNode temp = null;
        int skip = 1;
        int remove = 1;
        while(head != null){
            while(head != null && skip <= m){
                temp = head;
                head = head.next;
                skip++;
            }
            while(head != null && remove <= n){
                head = head.next;
                remove++;
            }
            temp.next = head;
            remove = 1;
            skip = 1;
        }
        return res;
    }
}

// 1 2 3 4 5 6 7 8 9 10
//           head
// res
//   temp
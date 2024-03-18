public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}

class MyLinkedList {
    int size; // keep track of the size 
    ListNode head; // head never change

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if(index >= size || index < 0) return -1;

        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }

        return cur.next.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }          
    //         2 (1)
    //  0 -> 1 -> 3
    //       cur
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0) index = 0;
        size++;

        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next = newNode;
    }
    //         
    //  0 -> 1 -> 2 -> 3
    //       cur  deleteNode
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0) return;
        size--;

        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        ListNode deleteNode = cur.next;
        cur.next = deleteNode.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
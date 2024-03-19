class Node {
    public int value;
    public Node nextNode;

    public Node(int value){
        this.value = value;
        this.nextNode = null;
    }
}
class MyCircularQueue {
    private int capacity;
    private Node head;
    private Node tail;
    private int count;

    public MyCircularQueue(int k) {
        this.capacity = k; // capacity never change 
    }
    
    public boolean enQueue(int value) {
        // if there is no space to add value
        if(this.capacity == this.count) {
            return false;
        }

        Node newNode = new Node(value);
        // first time add
        if(this.count == 0){
            head = tail = newNode;
        }else{
            tail.nextNode = newNode;
            tail = newNode;
        }
        this.count += 1;
        return true;
    }
    
    public boolean deQueue() {
        // if queue is empty, return false;
        if(isEmpty()) return false;
        this.head = this.head.nextNode;
        this.count -= 1;
        return true;
    }
    
    public int Front() {
        if(this.count == 0) return -1;
        return this.head.value;
    }
    
    public int Rear() {
        if(this.count == 0) return -1;
        return this.tail.value;
    }
    
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    public boolean isFull() {
        return this.count == this.capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
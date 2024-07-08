/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node p_copy = p;
        Node q_copy = q;

        // p_copy = 5, q_copy = 4
        // p_copy takes 1 step to reach parent, q_copy takes 3 steps to reach parent
        // we assign p_copy to q to complete 3 steps to reach parent again
        // we assign q_copy to p to complete 1 step to reach parent again
        // 1 - 3 + (3 - 1) = 0, p and q will meet at thier parent at the same time
        while(p_copy != q_copy){
            p_copy = p_copy == null ? q : p_copy.parent;
            q_copy = q_copy == null ? p : q_copy.parent;
        }

        return q_copy;
    }
}
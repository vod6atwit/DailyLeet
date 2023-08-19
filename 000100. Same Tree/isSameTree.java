/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if ((p == null && q != null) || (p != null && q == null)) {
      return false;
    }

    int a = p.val;
    int b = q.val;

    if (a == b) {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    } else
      return false;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 40.4 MB - Beats: 8.91%
// Link submission:
// https://leetcode.com/problems/same-tree/submissions/1025319073/
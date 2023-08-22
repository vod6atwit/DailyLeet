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
  public boolean isBalanced(TreeNode root) {
    int result = depth(root);
    if (result == -1) {
      return false;
    }
    return true;
  }

  public int depth(TreeNode n) {
    if (n == null) {
      return 0;
    }
    int left = depth(n.left);
    int right = depth(n.right);

    if (Math.abs(left - right) > 1) {
      return -1;
    }
    if (left == -1 || right == -1) {
      return -1;
    }
    return 1 + Math.max(left, right);
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 42.7 MB - Beats: 98.45%
// Link submission:
// https://leetcode.com/problems/balanced-binary-tree/submissions/1028737090/
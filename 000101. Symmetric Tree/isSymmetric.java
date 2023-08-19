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
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    TreeNode l = root.left;
    TreeNode r = root.right;

    return compare(l, r);
  }

  public boolean compare(TreeNode l, TreeNode r) {
    if (l == null && r == null) {
      return true;
    } else if (l != null && r == null || l == null & r != null) {
      return false;
    }

    int a = l.val;
    int b = r.val;

    if (a == b) {
      return compare(l.left, r.right) && compare(l.right, r.left);
    } else
      return false;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 40.6 MB - Beats: 57.5%
// Link submission:
// https://leetcode.com/problems/symmetric-tree/submissions/1025334685/
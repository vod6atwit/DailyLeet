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
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null) {
      return 1 + minDepth(root.right);
    } else if (root.right == null) {
      return 1 + minDepth(root.left);
    }
    return 1 + Math.min(minDepth(root.right), minDepth(root.left));
  }
}

// Runtime : 8ms - Beats: 64.17%
// Memory : 62.1 MB - Beats: 62.82%
// Link submission:
// https://leetcode.com/problems/minimum-depth-of-binary-tree/submissions/1029150472/
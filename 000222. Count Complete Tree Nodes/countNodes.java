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
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + countNodes(root.right) + countNodes(root.left);
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 45.7 MB - Beats: 51.15%
// Link submission:
// https://leetcode.com/problems/count-complete-tree-nodes/submissions/1039516048
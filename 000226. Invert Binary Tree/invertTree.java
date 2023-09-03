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
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode left = root.left;
    TreeNode right = root.right;

    root.left = right;
    root.right = left;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 40.3 MB - Beats: 27.73%
// Link submission:
// https://leetcode.com/problems/invert-binary-tree/submissions/1039494504
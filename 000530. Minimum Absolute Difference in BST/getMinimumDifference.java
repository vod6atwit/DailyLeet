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
  Integer result = Integer.MAX_VALUE;
  Integer prev = null;

  public int getMinimumDifference(TreeNode root) {
    if (root.left != null) {
      getMinimumDifference(root.left);
    }
    if (prev != null) {
      result = Math.min(result, Math.abs(root.val - prev));
    }
    prev = root.val;
    if (root.right != null) {
      getMinimumDifference(root.right);
    }

    return result;
  }
}

// dfs(3);
// dfs(2);
// dfs(4);

// Runtime : 1 ms - Beats: 49.72%
// Memory : 43.1 MB - Beats: 52.89%
// Link submission:
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/1046761344
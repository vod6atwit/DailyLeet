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
  public boolean hasPathSum(TreeNode root, int targetSum) {
    return helper(root, 0, targetSum);
  }

  public boolean helper(TreeNode node, int mySum, int targetSum) {
    if (node == null) {
      return false;
    }
    mySum += node.val;

    if (node.left == null && node.right == null) {
      return mySum == targetSum;
    }

    return helper(node.right, mySum, targetSum) || helper(node.left, mySum, targetSum);
  }
}

// Runtime : 0 ms - Beats: 100%
// Memory : 43.2 MB - Beats: 65.3%
// Link submission:
// https://leetcode.com/problems/path-sum/submissions/1030631814/
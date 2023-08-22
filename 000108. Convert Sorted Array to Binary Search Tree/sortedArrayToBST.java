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
  public TreeNode sortedArrayToBST(int[] nums) {

    int left = 0;
    int right = nums.length - 1;

    TreeNode result = helper(left, right, nums);

    return result;
  }

  public TreeNode helper(int l, int r, int[] nums) {
    if (l > r) {
      return null;
    }
    int middle = l + (r - l) / 2;
    TreeNode root = new TreeNode(nums[middle]);
    root.left = helper(l, middle - 1, nums);
    root.right = helper(middle + 1, r, nums);

    return root;
  }
}

// Runtime : 0ms - Beats: 100%
// Memory : 43.2 MB - Beats: 62.66%
// Link submission:
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/1028686858/
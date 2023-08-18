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

// Recursive solution
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();

    dfs(result, root);

    return result;
  }

  public void dfs(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    dfs(result, root.left);
    result.add(root.val);
    dfs(result, root.right);
  }
}

// 1
// null 2
// 3

// [1, 3, 2]

// ---------------

// Iteratively solution
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode curr = root;

    while (curr != null || !stack.isEmpty()) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }
      curr = stack.pop();
      result.add(curr.val);
      curr = curr.right;
    }
    return result;
  }
}

// 1
// null 2
// 3

// stack []
// result [1]

// Runtime : 0ms - Beats: 100%
// Memory : 41.2 MB - Beats: 9.33%
// Link submission:
// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1024452326/
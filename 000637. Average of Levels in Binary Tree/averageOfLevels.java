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
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    if (root == null)
      return result;

    // BFS approach
    // using queue as a data structure
    // we add all the node in the same line into the queue from left to right
    // We get the size of it
    // we calc the avarage of all the node
    // IF the node have left and right child, then we add it into the queue
    // accordingly
    // continue until the queue is empty

    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root);
    double sum = 0;

    while (!queue.isEmpty()) {
      sum = 0;
      double size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode curr = queue.poll();
        sum += curr.val;
        if (curr.left != null) {
          queue.add(curr.left);
        }
        if (curr.right != null) {
          queue.add(curr.right);
        }
      }

      double avg = sum / size;

      result.add(avg);
    }

    return result;
  }
}

// Runtime : 2 ms - Beats: 97.32%
// Memory : 44.4 MB - Beats: 83.79%
// Link submission:
// https://leetcode.com/problems/average-of-levels-in-binary-tree/submissions/1040713429
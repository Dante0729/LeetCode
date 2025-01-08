/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 1; 
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int currLevel = 0;
        int maxLevel = 1; // Start with the first level
        int maxSum = Integer.MIN_VALUE; // Track the maximum sum

        while (!queue.isEmpty()) {
            int size = queue.size();
            int currentLevelSum = 0;
            currLevel++;

            // Process all nodes in the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentLevelSum += node.val;

                // Add children to the queue
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            // Update maxSum and maxLevel if needed
            if (currentLevelSum > maxSum) {
                maxSum = currentLevelSum;
                maxLevel = currLevel;
            }
        }

        return maxLevel;
    }
}

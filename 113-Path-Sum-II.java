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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {         List<List<Integer>> pathSum = new ArrayList<>();
          if(root==null){
            return pathSum;
          }
          addPathSum(root,targetSum, pathSum, new ArrayList());
          return pathSum;
    }
    public void addPathSum(TreeNode root,int targetSum,List<List<Integer>> pathSum, List<Integer> list) {
         
        list.add(root.val);
        
        if (root.left == null && root.right == null) {
            if(root.val==targetSum){
               pathSum.add(new ArrayList<>(list));
            }
        } else {
            if (root.left != null) {
                addPathSum(root.left,targetSum-root.val, pathSum,list);
            }
            if (root.right != null) {
                addPathSum(root.right,targetSum-root.val, pathSum,list); 
            }
        }
        
        list.remove(list.size()-1);
        
        
    }
}
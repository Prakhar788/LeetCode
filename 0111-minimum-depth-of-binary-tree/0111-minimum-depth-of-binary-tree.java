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
    int minVal=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        
        
            return helper(root);
        }
        protected int helper(TreeNode curr){
            if(curr==null) return 0;
            int left=helper(curr.left);
            int right=helper(curr.right);
            return (left==0||right==0) ? left+right+1:
            Math.min(left,right)+1;
        }
    }
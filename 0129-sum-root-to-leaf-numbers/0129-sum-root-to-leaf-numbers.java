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
    public int sumNumbers(TreeNode root) {
       return Sum( root,0); 
    }
    public int Sum(TreeNode root,int n){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
           return n*10+root.val;
        }
        int lf=Sum(root.left,n*10+root.val);
        int rf=Sum(root.right,n*10+root.val);
        return lf+rf;
        
    }
}
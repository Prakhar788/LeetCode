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
// class Solution {
//     private boolean result=true;
//     public boolean isBalanced(TreeNode root) {
//         validate(root);
//         return result;
        
//     }
//     public int validate(TreeNode root){
//         if(root==null)
//             return 0;
//         int l=validate(root.left);
//         int r=validate(root.right);
//         if(Math.abs(l-r)>1)
//             result=false;
//         return 1;
//     }
// }
// class Solution {
    
//     public boolean isBalanced(TreeNode root) {
//         return validate(root)!=1;
        
//     }
//     public int validate(TreeNode root){
//         if(root==null)
//             return 0;
//         int l=validate(root.left);
//         if(l==-1){
//             return -1;
//         }
//         int r=validate(root.right);
//         if(r==-1){
//             return -1;
//         }
//         if(Math.abs(l-r)>1) return -1;
//          return Math.max(l,r)+1;
//     }
   
// }
class Solution {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root)!=-1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int l=maxDepth(root.left);
        if(l==-1)
            return -1;
        int r=maxDepth(root.right);
        if(r==-1)
            return -1;
        if(Math.abs(l-r)>1)
            return -1;
        return 1+Math.max(l,r);
    }
}
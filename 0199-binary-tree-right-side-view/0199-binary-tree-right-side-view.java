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
     int max_depth=-1;
    public List<Integer> rightSideView(TreeNode root) {
     
      List <Integer> ans=new ArrayList<>();
      helper(root,0,ans);
        
      return ans;
        
        
    }
    public void helper(TreeNode root,int curr,List <Integer> ans) {
      if(root==null){
          return;
      }  
      if(max_depth<curr){
          max_depth=curr;
          ans.add(root.val);
      }
       helper(root.right,curr+1,ans);
         helper(root.left,curr+1,ans);
    }
}
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        helper(root,targetSum,cur,list);
        return list;

    }
    public void helper(TreeNode root,int targetSum,List<Integer>cur,List<List<Integer>>list){
        if(root==null){
           return ;
       } 
        if(root.left==null && root.right==null&& targetSum-root.val==0){
            cur.add(root.val);
            list.add(new ArrayList<Integer>(cur));
            cur.remove(cur.size()-1);
        }
        cur.add(root.val);
        helper(root.left,targetSum-root.val,cur,list);
        helper(root.right,targetSum-root.val,cur,list);
        cur.remove(cur.size()-1);

        
    } 
}
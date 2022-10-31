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
    int nodeIdx;
    public TreeNode bstFromPreorder(int[] preorder) {
     if(preorder==null){
         return null;
     }
    nodeIdx=0;
    return bstHelper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private TreeNode bstHelper(int[]preorder,int start,int end){
        if(nodeIdx==preorder.length||preorder[nodeIdx]<start||preorder[nodeIdx]>end){
            return null;
        }
        int val=preorder[nodeIdx++];
        TreeNode node=new TreeNode(val);
        node.left=bstHelper(preorder,start,val);
        node.right=bstHelper(preorder,val,end);
        return node;
    }
}
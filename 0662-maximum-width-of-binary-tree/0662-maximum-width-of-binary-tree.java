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
    public class Pair
    {
        TreeNode node;
        int id;
        Pair(TreeNode n,int i)
        {
            node=n;
            id=i;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int width=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int n=q.size();
            int min=q.peek().id;
            int left=0,right=0;
            for(int i=0;i<n;i++)
            {
                int curr=q.peek().id-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0)
                    left=curr;
                if(i==n-1)
                    right=curr;
                if(node.left!=null)
                    q.add(new Pair(node.left,curr*2+1));
                if(node.right!=null)
                    q.add(new Pair(node.right,curr*2+2));
                
            }
            width=Math.max(width,right-left+1);
        }
        
        return width;
        
    }
}
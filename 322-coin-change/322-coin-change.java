class Solution {
    public int coinChange(int[] coins, int amount) {
        int max=amount+1;
        int[]dp=new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount ?-1:dp[amount];
    }
}
//*optimal sub structure.
//top down approach& bottom up.
//v.imp
//[amount-coin]
//minimum
//[0,1,2,3,4,5,6,7,8,9,10,11]
//[0,1,1,2,2,1,2,2,3,3,2,3]ways to make amount.
//[11-1]=[10]=3
//[11-2]=[9]=4
//[11-5]=[6]=3
//time=O(AXC)
//space=O(A)
//Where to use dp?1.Overlapping Subproblems
//2.Optimal substructure
//What is DP?-Dp is an algorithmic paradigm:Divide a problem into subproblems. AND compute results of subproblem.AND Storing them in memory with optimal Sub-Structure.
//technique
//methodology
//paradigm
//solving complex problems efficiently
//Breaking down problems into simpler sub problems.
//Solving Each Sub-Problems Exactly Once.
//Storing results of sub problems in a table and re-using when needed.
//What type of problems can be solved using dp?
//The problems should have the properties->
//Optimal Substructure.
//Overlapping Subproblems.

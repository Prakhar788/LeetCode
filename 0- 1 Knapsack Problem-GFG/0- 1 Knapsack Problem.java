
//Memo
// class Solution 
// { 
//     //Function to return max value that can be put in knapsack of capacity W.
//     static int knapSack(int W, int wt[], int val[], int n) 
//     { 
//          // your code here 
//          for(int[] i:dp){
//              Arrays.fill(i,-1);
//          }
//         return   knap(W, wt, val, n);
        
             
         
//     } 
    
//     static int[][] dp = new int[1002][1002];
//     static int knap(int W, int wt[], int val[], int n){
//         if(n==0 || W==0) 
//         {
//             return 0;
//         }
//          if(dp[n][W]!=-1)return dp[n][W];
//          if(wt[n-1]<=W){ 
//              dp[n][W]=Math.max(val[n-1]+knap(W-wt[n-1],wt,val,n-1), knap(W, wt, val, n-1));
             
//          }
//          else {
//              dp[n][W]= knap(W, wt, val, n-1);
             
//          }
//             return dp[n][W];
//     }
// }
// Top Down Approach
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp = new int [n+1][W+1];
         
         for(int i=1; i<dp.length; i++){
             for(int j=1; j<dp[0].length; j++){
                 if(wt[i-1]<=j){
                     dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                 }
                 else{
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         
         return dp[n][W];
             
         
    } 
    
   
}
